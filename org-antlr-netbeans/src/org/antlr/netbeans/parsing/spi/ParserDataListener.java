/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 *
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
package org.antlr.netbeans.parsing.spi;

import java.util.EventListener;
import org.netbeans.api.annotations.common.NonNull;

/**
 *
 * @author Sam Harwell
 * @param <T>
 */
public interface ParserDataListener<T> extends EventListener {

    void dataChanged(@NonNull ParserDataEvent<? extends T> event);

}
