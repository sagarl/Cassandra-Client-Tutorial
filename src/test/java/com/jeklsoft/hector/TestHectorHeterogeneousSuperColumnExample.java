package com.jeklsoft.hector;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestHectorHeterogeneousSuperColumnExample extends BaseReadingsTest {

    private static final Logger log = Logger.getLogger(HectorHeterogeneousSuperColumnExample.class);

    private static final Boolean useEmbeddedCassandra = true;

    @BeforeClass
    public static void configureCassandra() throws Exception {
        List<String> cassandraCommands = null;

        if (useEmbeddedCassandra) {
            cassandraCommands = new ArrayList<String>();
            cassandraCommands.add("create keyspace " + cassandraKeySpaceName + ";");
            cassandraCommands.add("use " + cassandraKeySpaceName + ";");
            cassandraCommands.add("create column family " + columnFamilyName + " with column_type = 'Super';");
        }

        initializeCassandra(cassandraCommands);
    }

    @Test
    public void testHectorAccess() throws Exception {

        HectorHeterogeneousSuperColumnExample example = new HectorHeterogeneousSuperColumnExample(keyspace, columnFamilyName);

        runAccessorTest(example);
    }
}
