package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderNavigationBar {

    public HeaderNavigationBar(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*Before using this,make sure window should be maximized.*/
    @FindBy (css ="li:nth-child(1) > a > span")

    public WebElement discuss;

    @FindBy (css ="li:nth-child(2) > a > span")
    public WebElement calendar;

    @FindBy (css = "li:nth-child(3) > a > span")
    public WebElement notes;

    @FindBy (css = "li:nth-child(4) > a > span")
    public WebElement contacts;

    @FindBy (css = "li:nth-child(5) > a > span")
    public WebElement CRM;

    @FindBy (css = "li:nth-child(6) > a > span")
    public WebElement sales;

    @FindBy (css = "li:nth-child(7) > a > span")
    public WebElement website;

    @FindBy (css = "li:nth-child(8) > a > span")
    public WebElement pointOfSale;

    @FindBy (css = "li:nth-child(9) > a > span")
    public WebElement purchases;

    @FindBy (css = "li:nth-child(10) > a > span")
    public WebElement inventory;

    @FindBy (css = "li:nth-child(11) > a > span")
    public WebElement repairs;

    @FindBy (css = "li:nth-child(12) > a > span")
    public WebElement events;

    @FindBy (css = "li:nth-child(13) > a > span")
    public WebElement employees;

    @FindBy (css = "li:nth-child(14) > a > span")
    public WebElement leaves;

    @FindBy (css = " li:nth-child(15) > a > span")
    public WebElement expenses;

    @FindBy (css = "li:nth-child(16) > a > span")
    public WebElement  maintenance;

    @FindBy(css= "li:nth-child(17) > a > span")
    public WebElement dashboards;
}
