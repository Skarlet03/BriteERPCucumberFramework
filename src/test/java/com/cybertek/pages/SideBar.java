package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SideBar {

   public SideBar() {


       PageFactory.initElements(Driver.getDriver(), this);

   }


   @FindBy ( xpath = "/html/body/div[1]/div[1]/a/img")
   public WebElement subMenuLogo;

   @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div[9]/div[1]/text()")
   public WebElement purchase;

   @FindBy (linkText = "Requests for Quotation")
   public WebElement requestsForQuotationLink;


   @FindBy (linkText = "Purchase Orders")
   public WebElement purchaseOrdersLink;

   @FindBy (linkText = "Vendors")
    public WebElement vendorsLink;

   @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div[9]/ul[1]/li[4]/a/span")
    public WebElement products;

   @FindBy (linkText = "Control")
    public WebElement controlLink;

   @FindBy (linkText = "Incoming Products")
    public WebElement incomingProductsLink;

   @FindBy (linkText = "Vendor Bills")
    public WebElement vendorBillsLink;


   @FindBy (linkText = "Reporting")
    public WebElement reportingLink;
}
