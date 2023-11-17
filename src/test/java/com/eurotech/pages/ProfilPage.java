package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProfilPage extends BasePage{
    @FindBy(name = "githubusername")
    public WebElement githubUserName;

    @FindBy(linkText = "Go Back")
    public WebElement goBackBtn;
    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    public void selectMenu(WebElement element,String status){
        Select select = new Select(element);
        select.selectByVisibleText(status);
    }

}
