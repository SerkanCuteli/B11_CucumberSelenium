package com.eurotech.dbPractice;

import com.eurotech.utulities.DBUtils;
import com.eurotech.utulities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

import javax.swing.*;
import java.util.List;

public class DbMethods {
    public List<Object> getTableValues(String tableName){
        System.out.println(tableName + " verisi aliniyor: ");
        return  DBUtils.getRowList("select * from "+tableName);
    }

    public void verifyUserProfileValues(String userEmail, String columnName, String expectedValue) {
            // get actual column value
            // select id from user where email = 'salihdemir098@outlook.com'

       int userId = (int)DBUtils.getCellValue("select id from user where email = '"+userEmail+"'");
        System.out.println("userId = " + userId);
        // select a company from profile where userId = 1460;

        String actualValue =(String)DBUtils.getCellValue("select " + columnName + " from profile where userId = "+userId+"");
        System.out.println("actualValue = " + actualValue);
        Assert.assertEquals("Values are not equal!!", actualValue, expectedValue);

    }

    public void verifyUserProfileValuesWithUI(String userEmail,String columnName){
       // get the actual value from UI
        String actualValue = Driver.get().findElement(By.name(columnName)).getAttribute("value");

        // get the expected value from DB

        //select id from user where email = 'salihdemir098@outlook.com';
        int userId = (int)DBUtils.getCellValue("select id from user where email = '"+userEmail+"'");
        String expectedDbValue = (String) DBUtils.getCellValue("select "+columnName+" from profile where userId = '"+userId+"'");

        Assert.assertEquals("Values are not equal!!",expectedDbValue,actualValue);


    }
}
