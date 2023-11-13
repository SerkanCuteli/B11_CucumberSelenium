package com.eurotech.stepDefinitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utulities.BrowserUtils;
import com.eurotech.utulities.ConfigurationReader;
import com.eurotech.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Given("The user is on the log in page")
    public void the_user_is_on_the_log_in_page() {
        //System.out.println("I open the browser and navigate to DevEx login page");
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        //System.out.println("T enter teacher username and password then click login button");
        loginPage.loginAsTeacher();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that URL is changed to dashboard");
        String actualMessage = dashboardPage.welcomeText.getText();
        Assert.assertTrue("Verify welcome text includes 'Welcome'", actualMessage.contains("Welcome"));

    }
    @When("The user enters student credentials")
    public void the_usser_enters_student_credentials() {
        //System.out.println("T enter student username and password then click login button");
        loginPage.loginAsStudent();

    }
    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        //System.out.println("T enter developer username and password then click login button");
        loginPage.loginAsDeveloper();
    }
    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username,password);
    }
    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String user) {
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(user));

    }

    @Then("The user should be able to see message as {string}")
    public void the_user_should_be_able_to_see_message_as(String expectedMessage) {
        // to find totally disappearing warning message
//        String validationMessage = loginPage.userEmailInput.getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);
        BrowserUtils.waitFor(2);
        String actualMessage = loginPage.getDisappearingWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
          }

}
