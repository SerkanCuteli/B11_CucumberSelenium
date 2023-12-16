package com.eurotech.dbPractice;

import com.eurotech.utulities.DBUtils;
import org.junit.Test;

public class dbTests {

    @Test
    public void dbTest() throws Exception {

        DBUtils.createConnection();
        DBUtils.getRowList("select * from user");
        System.out.println("DBUtils.getRowCount() = " + DBUtils.getRowCount());
        DBUtils.destroy();
    }
}

