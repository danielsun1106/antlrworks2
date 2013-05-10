/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 *
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
package org.antlr.works.editor.grammar.codemodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.antlr.works.editor.grammar.codemodel.TokenVocabDeclarationModel;
import org.antlr.works.editor.grammar.codemodel.TokenVocabModel;

/**
 *
 * @author Sam Harwell
 */
public class TokenVocabDeclarationModelImpl extends AbstractCodeElementModel implements TokenVocabDeclarationModel {

    public TokenVocabDeclarationModelImpl(String name, FileModelImpl file) {
        super(name, file);
    }

    @Override
    public Collection<? extends AbstractCodeElementModel> getMembers() {
        return Collections.emptyList();
    }

    @Override
    public Collection<TokenVocabModel> resolve() {
        List<TokenVocabModel> result = new ArrayList<>();
        // first try to find a grammar with this name
        PackageModelImpl packageModel = getFile().getPackage();
        for (FileModelImpl fileModel : packageModel.getFiles()) {
            String grammarName = fileModel.getName();
            int dot = grammarName.indexOf('.');
            if (dot >= 0) {
                grammarName = grammarName.substring(0, dot);
            }

            if (grammarName.equals(getName())) {
                result.add(fileModel.getVocabulary());
            }
        }

        // TODO: next try to find a .tokens file with this name

        return result;
    }

}
