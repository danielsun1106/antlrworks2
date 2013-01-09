/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package com.tvl.antlrworks.project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListCellRenderer;
import javax.swing.event.ChangeListener;
import org.netbeans.api.annotations.common.NonNull;
import org.netbeans.api.project.Project;
import static com.tvl.antlrworks.project.Bundle.*;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.modules.project.ui.spi.TemplateCategorySorter;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataShadow;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Children;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.AsyncGUIJob;
import org.openide.util.ChangeSupport;
import org.openide.util.NbBundle.Messages;
import org.openide.util.Utilities;

/**
 * Provides the GUI for the template chooser panel.
 * @author Jesse Glick
 */
final class TemplateChooserPanelGUI extends javax.swing.JPanel implements PropertyChangeListener, AsyncGUIJob {
    
    /** preferred dimension of the panels */
    private static final Dimension PREF_DIM = new Dimension(500, 340);
    
    // private final String[] recommendedTypes = null;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    //Templates folder root
    private FileObject templatesFolder;

    //GUI Builder
    private TemplatesPanelGUI.Builder builder;
    private Project project;
    private @NonNull String[] projectRecommendedTypes;
    private String category;
    private String template;
    private boolean isWarmUp = true;
    private ListCellRenderer projectCellRenderer;
    private boolean firstTime = true;
    private ActionListener defaultActionListener;

    @Messages("LBL_TemplateChooserPanelGUI_Name=Choose File Type")
    public TemplateChooserPanelGUI() {
        this.builder = new FileChooserBuilder ();
        initComponents();
        setPreferredSize( PREF_DIM );
        setName(LBL_TemplateChooserPanelGUI_Name());
        projectCellRenderer = new ProjectCellRenderer ();
        projectsComboBox.setRenderer (projectCellRenderer);
     }
    
    public void readValues (Project p, String category, String template) {
        assert p != null : "Project can not be null";   //NOI18N
        boolean wf;
        synchronized (this) {
            this.project = p;
            this.projectRecommendedTypes = OpenProjectList.getRecommendedTypes(p);
            this.category = category;
            this.template = template;
            wf = this.isWarmUp;
        }
        if (!wf) {
            this.selectProject ( project );
            ((TemplatesPanelGUI)this.templatesPanel).setSelectedCategoryByName (this.category);
            ((TemplatesPanelGUI)this.templatesPanel).setSelectedTemplateByName (this.template);
        }
    }

    @Override
    public void removeNotify() {
        super.removeNotify();
        project = null;
    }

    /** Called from readSettings, to initialize the GUI with proper components
     */
    private void initValues( Project p ) {
        // Populate the combo box with list of projects
        Project openProjects[] = OpenProjects.getDefault().getOpenProjects();
        Arrays.sort(openProjects, OpenProjectList.projectByDisplayName());
        DefaultComboBoxModel projectsModel = new DefaultComboBoxModel( openProjects );
        projectsComboBox.setModel( projectsModel );
        this.selectProject (p);
    }

    private void selectProject (Project p) {
        if (p != null) {
            DefaultComboBoxModel projectsModel = (DefaultComboBoxModel) projectsComboBox.getModel ();
            if ( projectsModel.getIndexOf( p ) == -1 ) {
                projectsModel.insertElementAt( p, 0 );
            }
            projectsComboBox.setSelectedItem( p );
        }
    }


    public void addChangeListener(ChangeListener l) {
        changeSupport.addChangeListener(l);
    }
    
    public void removeChangeListener(ChangeListener l) {
        changeSupport.removeChangeListener(l);
    }
    
    private void fireChange() {
        changeSupport.fireChange();
    }

    void setDefaultActionListener( ActionListener al ) {
        this.defaultActionListener = al;
    }

    public Project getProject() {
        boolean wf;
        synchronized (this) {
            wf = isWarmUp;
        }
        if (wf) {
            return this.project;
        }
        else {
            return (Project)projectsComboBox.getSelectedItem();
        }
    }
    
    public FileObject getTemplate() {
        return ((TemplatesPanelGUI)this.templatesPanel).getSelectedTemplate ();
    }
    
    @Override public void propertyChange(PropertyChangeEvent evt) {
        fireChange();
    }
    
    
    @Override public Dimension getPreferredSize() {
        return PREF_DIM;
    }
    
    public String getCategoryName () {
        return ((TemplatesPanelGUI)this.templatesPanel).getSelectedCategoryName ();
    }

    public String getTemplateName () {
        return ((TemplatesPanelGUI)this.templatesPanel).getSelectedTemplateName ();
    }

    public void setCategory (String category) {
        ((TemplatesPanelGUI)this.templatesPanel).setSelectedCategoryByName (category);
    }
    
    @Override public void addNotify () {
        if (firstTime) {
            //77244 prevent multiple initializations..
            Utilities.attachInitJob (this, this);
            firstTime = false;
        }
        super.addNotify ();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        projectsComboBox = new javax.swing.JComboBox();
        templatesPanel = new TemplatesPanelGUI (this.builder);

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setLabelFor(projectsComboBox);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(TemplateChooserPanelGUI.class, "LBL_TemplateChooserPanelGUI_jLabel1")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 13, 0);
        add(jLabel1, gridBagConstraints);
        jLabel1.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(TemplateChooserPanelGUI.class, "ACSN_jLabel1")); // NOI18N
        jLabel1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(TemplateChooserPanelGUI.class, "ACSD_jLabel1")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 12, 0);
        add(projectsComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(templatesPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox projectsComboBox;
    private javax.swing.JPanel templatesPanel;
    // End of variables declaration//GEN-END:variables

    // private static final Comparator NATURAL_NAME_SORT = Collator.getInstance();

    private static final class TemplateKey {
        final DataObject d;
        final boolean leaf;
        TemplateKey(DataObject d, boolean leaf) {
            this.d = d;
            this.leaf = leaf;
        }
        @Override public boolean equals(Object o) {
            if (!(o instanceof TemplateKey)) {
                return false;
            }
            return d == ((TemplateKey) o).d && leaf == ((TemplateKey) o).leaf;
        }
        @Override public int hashCode() {
            return d.hashCode();
        }
    }
    private final class TemplateChildren extends ChildFactory.Detachable<TemplateKey> implements ActionListener {
        
        private final DataFolder folder;
        private final boolean isRoot;
        
        TemplateChildren(DataFolder folder, boolean root) {
            this.folder = folder;
            isRoot = root;
        }
        
        @Override protected void addNotify() {
            projectsComboBox.addActionListener( this );
        }
        
        @Override protected void removeNotify() {
            projectsComboBox.removeActionListener( this );
        }

        @Override protected boolean createKeys(List<TemplateKey> keys) {
            DataObject[] children = folder.getChildren();
            if (isRoot) {
                Project p = getProject();
                TemplateCategorySorter tcs = p != null ? p.getLookup().lookup(TemplateCategorySorter.class) : null;
                if (tcs != null) {
                    List<DataObject> dobjs = new ArrayList<DataObject>();                    
                    for (DataObject d : children) {
                        if (isFolderOfTemplates(d)) {
                            dobjs.add(d);
                        }
                    }
                    List<DataObject> sorted = tcs.sort(dobjs);
                    assert sorted.size() == dobjs.size() && new HashSet<DataObject>(dobjs).equals(new HashSet<DataObject>(sorted));
                    children = sorted.toArray(new DataObject[children.length]);
                }
            }
            
            for (DataObject d : children) {
                if (isFolderOfTemplates(d)) {
                    boolean leaf = true;
                    for (DataObject child : ((DataFolder) d).getChildren()) {
                        if (isFolderOfTemplates(child)) {
                            leaf = false;
                            break;
                        }
                    }
                    keys.add(new TemplateKey(d, leaf));
                }
            }
            return true;
        }
        
        @Override protected Node createNodeForKey(TemplateKey k) {
            return new FilterNode(k.d.getNodeDelegate(), k.leaf ? Children.LEAF : Children.create(new TemplateChildren((DataFolder) k.d, false), true));
        }
        
        @Override public void actionPerformed (ActionEvent event) {
            projectRecommendedTypes = OpenProjectList.getRecommendedTypes(getProject());
            final String cat = getCategoryName ();
            String template =  ((TemplatesPanelGUI)TemplateChooserPanelGUI.this.templatesPanel).getSelectedTemplateName();
            refresh(false);
            setCategory (cat);
            ((TemplatesPanelGUI)TemplateChooserPanelGUI.this.templatesPanel).setSelectedTemplateByName(template);
        }
                
        
        // Private methods -----------------------------------------------------
        
        private boolean isFolderOfTemplates(DataObject d) {
            if (d instanceof DataFolder && !isTemplate((DataFolder)d))  {
                Object o = d.getPrimaryFile().getAttribute("simple"); // NOI18N
                if (o == null || Boolean.TRUE.equals(o)) {
                    return hasChildren((Project) projectsComboBox.getSelectedItem(), d);
                }
            }
            return false;
        }
        
    }
    
    private final class FileChildren extends ChildFactory<DataObject> {
        
        private DataFolder root;
                
        public FileChildren (DataFolder folder) {
            this.root = folder;
            assert this.root != null : "Root can not be null";  //NOI18N
        }
        
        @Override protected boolean createKeys(List<DataObject> keys) {
            for (DataObject dobj : root.getChildren()) {
                if (isTemplate(dobj) && OpenProjectList.isRecommended(projectRecommendedTypes, dobj.getPrimaryFile())) {
                    if (dobj instanceof DataShadow) {
                        dobj = ((DataShadow) dobj).getOriginal();
                    }
                    keys.add(dobj);
                }
            }
            return true;
        }

        @Override protected Node createNodeForKey(DataObject d) {
            return new FilterNode(d.getNodeDelegate(), Children.LEAF);
        }
        
    }
    
  
    final class FileChooserBuilder implements TemplatesPanelGUI.Builder {
        
        @Override public Children createCategoriesChildren(DataFolder folder) {
            return Children.create(new TemplateChildren(folder, true), true);
        }
        
        @Override public Children createTemplatesChildren(DataFolder folder) {
            return Children.create(new FileChildren(folder), true);
        }

        @Override public void fireChange() {
            TemplateChooserPanelGUI.this.fireChange();
        }

        @Messages("CTL_Categories=&Categories:")
        @Override public String getCategoriesName() {
            return CTL_Categories();
        }
        
        @Messages("CTL_Files=&File Types:")
        @Override public String getTemplatesName() {
            return CTL_Files();
        }

        @Override
        public void actionPerformed( ActionEvent e ) {
            if( null != defaultActionListener ) {
                defaultActionListener.actionPerformed( e );
            }
        }
    }
    
    
    private static boolean isTemplate (DataObject dobj) {
        if (dobj.isTemplate())
            return true;
        if (dobj instanceof DataShadow) {
            return ((DataShadow)dobj).getOriginal().isTemplate();
        }
        return false;
    }
    
    private boolean hasChildren (Project p, DataObject folder) { 
        if (!(folder instanceof DataFolder)) {
            return false;
        }
        
        DataFolder f = (DataFolder) folder;
        if (!OpenProjectList.isRecommended(projectRecommendedTypes, f.getPrimaryFile())) {
            // Eg. Licenses folder.
            //see #102508
            return false;
        }
        DataObject[] ch = f.getChildren ();
        for (int i = 0; i < ch.length; i++) {
            if (isTemplate (ch[i]) && OpenProjectList.isRecommended(projectRecommendedTypes, ch[i].getPrimaryFile ())) {
                // XXX: how to filter link to Package template in each java types folder?
                if (!(ch[i] instanceof DataShadow)) {
                    return true;
                }
            } else if (ch[i] instanceof DataFolder && hasChildren (p, ch[i])) {
                return true;
            }
        }
        return false;
        
        // simplied but more counts
        //return new FileChildren (p, (DataFolder) folder).getNodesCount () > 0;
        
    }
    
    @Override public void construct() {
        this.templatesFolder = FileUtil.getConfigFile("Templates");
        ((TemplatesPanelGUI)this.templatesPanel).warmUp(this.templatesFolder);
    }
    
    @Override public void finished() {
        //In the awt
        Cursor cursor = null;
        try {
            Project p;
            String c,t;
            synchronized (this) {
                p = this.project;
                c = this.category;
                t = this.template;
            }
            cursor = TemplateChooserPanelGUI.this.getCursor();
            TemplateChooserPanelGUI.this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            initValues( p );
            ((TemplatesPanelGUI)this.templatesPanel).doFinished (this.templatesFolder, c, t);
        } finally {
            synchronized (this) {
                isWarmUp = false;
            }
            if (cursor != null) {
                this.setCursor (cursor);
            }
        }
    }
    
}
