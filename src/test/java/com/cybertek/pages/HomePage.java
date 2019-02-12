package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

   public HomePage(){
       PageFactory.initElements(Driver.getDriver(),this); }

       @FindBy(xpath = "//span[.='Home']")
       public WebElement home;

   @FindBy(linkText = "Purchases")
   public WebElement purchasesButton;

    @FindBy(xpath = "//span[.='Shop']")
    public WebElement shop;

    @FindBy(xpath = "//span[.='Events']")
    public WebElement events;

    @FindBy(xpath = "//span[.='Forum']")
    public WebElement forum;

    @FindBy(xpath = "//span[.='Blog']")
    public WebElement blog;

    @FindBy(xpath = "//span[.='Presentations']")
    public WebElement presentations;


    @FindBy(xpath = "//span[.='Contact us']")

    public WebElement contacts;


    @FindBy(xpath = "//b[.='Sign in']")
    public WebElement signIn;


}

