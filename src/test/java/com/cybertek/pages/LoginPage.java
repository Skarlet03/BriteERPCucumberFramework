package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {



    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy (xpath = "//input[@id='login']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement logIn;




    public void loginPOSManager() {
        new EntryPage().brietErpDemoAnchor.click();
        username.sendKeys(ConfigurationReader.getProperty("manager-username"));
        password.sendKeys(ConfigurationReader.getProperty("manager-password"));
        logIn.click();
    }








}


