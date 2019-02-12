package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class RequestsForQuotation {


    public RequestsForQuotation(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//li[.='Requests for Quotation']")
    public WebElement requestsForQuotation;

    @FindBy (xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy (xpath = "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(css=".o_searchview_input")
    public WebElement searchField;

    @FindBy(css="span[title='Advanced Search...']")
    public WebElement advSearch;

    @FindBy(css=".o_dropdown")
    private List<WebElement> btns;

    public WebElement getFilters(){
        return btns.get(2);
    }

    public WebElement getGroupBy(){
        System.out.println(btns.size());
        return btns.get(3);
    }

    public WebElement getFavorities(){
        return btns.get(4);
    }




}
