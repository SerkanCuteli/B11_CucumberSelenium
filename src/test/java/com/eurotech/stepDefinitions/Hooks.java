package com.eurotech.stepDefinitions;

import com.eurotech.utulities.BrowserUtils;
import com.eurotech.utulities.DBUtils;
import com.eurotech.utulities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setUp(){
        //System.out.println("\tThis is coming from Before method");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario ){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        //System.out.println("\tThis is coming from After method");
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
    @Before("@db")
    public void setUpDB(){
        DBUtils.createConnection();
    }
    @After("@db")
    public void tearDownDB(){
        DBUtils.destroy();
    }
}
