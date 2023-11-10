package com.eurotech.pages;


import com.eurotech.utulities.BrowserUtils;
import com.eurotech.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(linkText = "All Posts")
    public WebElement allPostsMenu;

    @FindBy(linkText= "Developers" )
    public WebElement developersMenu;

    @FindBy(id = "navbar-menu-list2-item3-text")
    public WebElement myAccountMenu;

    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']")).click();
    }

    public void navigateToSubMenu(String subMenuName){
        BrowserUtils.hover(myAccountMenu);
        Driver.get().findElement(By.xpath("//span[text()='"+subMenuName+"']")).click();
    }

}
