/**
Copyright (C) SYSTAP, LLC DBA Blazegraph 2006-2016.  All rights reserved.

Contact:
     SYSTAP, LLC DBA Blazegraph
     2501 Calvert ST NW #106
     Washington, DC 20008
     licenses@blazegraph.com

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; version 2 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/
package com.blazegraph.gremlin.internal;

import java.util.Collection;

import com.bigdata.rdf.internal.DefaultExtensionFactory;
import com.bigdata.rdf.internal.IDatatypeURIResolver;
import com.bigdata.rdf.internal.IExtension;
import com.bigdata.rdf.internal.ILexiconConfiguration;
import com.bigdata.rdf.model.BigdataLiteral;
import com.bigdata.rdf.model.BigdataValue;

/**
 * Extension factory for Tinkerpop3.  Currently the only extension in use
 * is the {@link ListIndexExtension} for Cardinality.list.
 */
public class Tinkerpop3ExtensionFactory extends DefaultExtensionFactory {

  /**
   * initialize the extension factory
   * @param resolver
   * @param lex
   * @param extensions
   */
    protected void _init(final IDatatypeURIResolver resolver,
            final ILexiconConfiguration<BigdataValue> lex,
            final Collection<IExtension<? extends BigdataValue>> extensions) {
        
        /*
         * Add ListIndexExtension for Cardinality.list.
         */
        extensions.add(new ListIndexExtension<BigdataLiteral>(resolver));
        
    }
    
}
