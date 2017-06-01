package org.umlg.sqlg.test.tp3.groovy;

import org.apache.tinkerpop.gremlin.GraphProviderClass;
import org.apache.tinkerpop.gremlin.groovy.GroovyEnvironmentSuite;
import org.junit.runner.RunWith;
import org.umlg.sqlg.structure.SqlgGraph;
import org.umlg.sqlg.test.tp3.SqlgMySQLProvider;

@RunWith(GroovyEnvironmentSuite.class)
@GraphProviderClass(provider = SqlgMySQLProvider.class, graph = SqlgGraph.class)
public class SqlgMySQLGroovyEnvironmentTest {

}