package com.eurotech.stepDefinitions;

import com.eurotech.pages.ProfilPage;
import io.cucumber.java.en.When;

public class EditProfile_StepDefs {
    ProfilPage profilPage = new ProfilPage();
    @When("The user select status {string}")
    public void the_user_select_status(String status) {
        profilPage.selectMenu(profilPage.selectBox, status );

    }
    @When("The user slides the slader {int}")
    public void the_user_slides_the_slader(Integer int1) {

    }
    @When("The user add {string} {string}")
    public void the_user_add(String string, String string2) {

    }
    @When("The user clicks on the submit button")
    public void the_user_clicks_on_the_submit_button() {

    }

}
