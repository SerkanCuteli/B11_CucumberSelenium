package com.eurotech.pages;


import com.eurotech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy(id = "dashboard-h1")
    public WebElement dashboardText;
    @FindBy(id = "dashboard-p1")
    public WebElement welcomeMessage;


    @FindBy(id = "dashboard-p1")
    public WebElement welcomeText;

    @FindBy(className = "nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(linkText = "Edit Profile")
    public WebElement edit;

    @FindBy(linkText = "Add Experience")
    public WebElement addEx;

    @FindBy(linkText = "Add Education")
    public WebElement addEdu;

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> dashboardList;

    @FindBy(id = "navbar-menu-list-item1-myposts")
    public WebElement myposts;


    @FindBy(id = "navbar-menu-list-item3-text")
    public WebElement logout;

    @FindBy(id = "loginpage-h1")
    public WebElement signIn;

    @FindBy(xpath = "//tbody/tr[2]/td[2]") //*[text()='Test Automation Engineer']
    public WebElement jobTitle;


    //same locator type with base menu so we can use navigateToMenu()
//    public void dashboardMenu(String menuName){
//        Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']")).click();
//    }

    public String getTitle(String title) {
        return Driver.get().findElement(By.xpath("//td[text()='" + title + "']")).getText();
    }

    public String getCompany(String company) {
        return Driver.get().findElement(By.xpath("//td[text()='" + company + "']")).getText();
    }

    public String getTextCommon(String element) {
        return Driver.get().findElement(By.xpath("//td[text()='" + element + "']")).getText();
    }


}
