package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {


    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getModulePageHeaders(String modulePageHeader){
        String xpath = "//li[contains(text(),'" + modulePageHeader + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getFilterDefaulttext(String filterDefaultText){
        String xpath = "//span[contains(text(), '" + filterDefaultText + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy (xpath = "//span[@class='fa fa-filter o_searchview_facet_label']")
    public WebElement filterButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;


    public WebElement getProduct(String productName){
        String xpath = "//span[contains(text(), '" + productName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//button[contains(text(), 'Print')]")
    public WebElement printDropdownBtn;

    @FindBy(xpath = "//a[contains(text(), 'Products Labels')]")
    public WebElement printProductsLabelBtn;

    @FindBy(xpath = "//button[contains(text(), 'Update Qty On Hand')]")
    public WebElement updateProductQtyBtn;

    @FindBy(xpath = "//input[@id='o_field_input_11223']")
    public WebElement updateProductQtyInputBox;


    public WebElement getUpdateProductQtyBtn(String name){
        String xpath = "//span[contains(text(), '" + name + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[1]")
    public WebElement sendMessageBtn;

    @FindBy(xpath = "//textarea[@class='o_input o_composer_text_field']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")
    public WebElement sendBtn;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[2]")
    public WebElement logNoteBtn;

    @FindBy(xpath = "//textarea[@class='o_input o_composer_text_field']")
    public WebElement logBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")
    public WebElement logBtn;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[3]")
    public WebElement scheduleActivityBtn;


}
