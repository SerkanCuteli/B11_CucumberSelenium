package com.eurotech.pages;


import com.eurotech.utulities.BrowserUtils;
import com.eurotech.utulities.Driver;
import com.eurotech.utulities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

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

    public String getHeaderText(String headerName){
        //return Driver.get().findElement(By.xpath("//*[text()='"+headerName+"']")).getText();
        return Driver.get().findElement(By.xpath("//section[@class='container']/*[text()='"+headerName+"']")).getText();
    }

    public List<Map<String, String>> getDataList(String sheetName){
        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/Batch11_DevEx.xlsx", sheetName);
        List<Map<String, String>> dataList = excelUtil.getDataList();
        return dataList;

    }

}
