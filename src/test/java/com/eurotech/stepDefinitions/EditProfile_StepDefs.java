package com.eurotech.stepDefinitions;

import com.eurotech.pages.EditProfilPage;
import io.cucumber.java.en.When;

public class EditProfile_StepDefs {
    EditProfilPage editProfilPage = new EditProfilPage();
    @When("The user select status {string}")
    public void the_user_select_status(String status) {
        editProfilPage.selectMenu(editProfilPage.selectBox, status );

    }
    @When("The user slides the slader {int}")
    public void the_user_slides_the_slader(Integer num) {
        editProfilPage.slider(num);

    }
    @When("The user add {string} {string}")
    public void the_user_add(String inputBoxName, String userInfo) {
        editProfilPage.addInfo(inputBoxName, userInfo);

    }
    @When("The user clicks on the submit button")
    public void the_user_clicks_on_the_submit_button() {
        editProfilPage.editProfileSubmitBtn.click();

    }

}
