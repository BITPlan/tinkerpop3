/**
Copyright (C) SYSTAP, LLC DBA Blazegraph 2018.  All rights reserved.

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
package com.blazegraph.gremlin.structure;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestBasicOperations.class, TestBulkLoad.class,
    TestHistory.class,TestSearch.class, SampleCode.class
    // uncomment to run full testsuite with some 810 tests
    ,BlazeGraphStructureStandardTest.class 
    })
/**
 * run test as a suite 
 * @author wf
 *
 */
public class TestSuite {

}
