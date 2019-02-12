package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PurchaseOrdersPage {

    public PurchaseOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getModuleDefaultPageHeader(String modulePageHeader){
        String xpath = "//li[contains(text(),'" + modulePageHeader + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getModuleNewPageHeader(String pageHeader){
        String xpath = "(//a[contains(text(),'" + pageHeader + "')])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement modulePageTopBtn(String buttonName){
        String xpath = "(//button[contains(text(),'" + buttonName + "')])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement tableHeaders(String tableHeader, int index){
        String xpath = "//*[.='" + tableHeader + "'][" + index + "]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

//    public WebElement refNumbers(String refNumber){
//        String xpath ="(//*[.='" + refNumber + "']";
//        return Driver.getDriver().findElement(By.xpath(xpath));
//    } doesnt work
@FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr[10]/td[2]")
public WebElement refNumber;

    @FindBy(linkText ="Deliveries & Invoices")
            //"//a[.='Deliveries & Invoices']/@href") wrong xpath
    public WebElement deliveriesAndInvoicesBtn;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[1]")
    public WebElement sendMessageBtn;


    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[2]")
    public WebElement logNote;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[3]")
    public WebElement scheduleActivityBtn;

    @FindBy(linkText = "Add an item")
            //xpath = "//a[.='Add an item']/@href") wrong xpath
    public WebElement addAnItemBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//button[.='Receive Products']")
    public WebElement receiveProductsBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public  WebElement createButton;

    @FindBy(xpath = "//div[1]/div[3]/button")
    public  WebElement favoriteButton;

    @FindBy(xpath= "//div[1]/div/span")
    public  WebElement advancedSearchButton;

    @FindBy(xpath= "//thead/tr/th[4]")
    public  WebElement scheduleDate;



}
