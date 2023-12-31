package com.eurotech.stepDefinitions;

import com.eurotech.dbPractice.DbMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DB_StepDefs {
    DbMethods dbMethods = new DbMethods();

    @Given("I get {string} table values")
    public void iGetTableValues(String tableName) {
        System.out.println("dbMethods.getTableValues(tableName) = " + dbMethods.getTableValues(tableName));

    }


    @Then("Verify that user {string}profiles {string} db value is equal to {string}")
    public void verifyThatUserProfilesDbValueIsEqualTo(String userEmail, String columnName, String expectedValue) {
        dbMethods.verifyUserProfileValues(userEmail,columnName,expectedValue);
    }

    @Then("Verify that user {string} UI profile {string} value match with DB value")
    public void verifyThatUserUIProfileValueMatchWithDBValue(String userEmail, String columnName) {
        dbMethods.verifyUserProfileValuesWithUI(userEmail,columnName);
    }
}
