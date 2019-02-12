package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class IncomingProdsPage {
    public IncomingProdsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* this is the whole content element, can be verified for availability */
    @FindBy(className = "o_content")
    public WebElement incomingProductsContent;

    /* this is the whole table element, can be verified for availability */
    @FindBy(className = "table-responsive")
    public WebElement incomingProductsTable;

    /* the WebElement of the whole table header */
    @FindBy(tagName = "thead")
    public WebElement tableHeaderContent;

    /* the List<WebElement> of all elements of the header */
    @FindBy(css = "thead >tr >th")
    public List<WebElement> tableHeaderElementsList;
    /* the following elements are part of the header */
    @FindBy(css = "thead > tr > th:nth-of-type(1)")
    public WebElement headerCheckAllCheckbox;
    @FindBy(css = "thead > tr > th:nth-of-type(2)")
    public WebElement headerExpectedDateOrganizer;
    @FindBy(css = "thead > tr > th:nth-of-type(3)")
    public WebElement headerDateOrganizer;
    @FindBy(css = "thead > tr > th:nth-of-type(4)")
    public WebElement headerSourceDepartmentOrganizer;
    @FindBy(css = "thead > tr > th:nth-of-type(5)")
    public WebElement headerProductOrganizer;
    @FindBy(css = "thead > tr > th:nth-of-type(6)")
    public WebElement headerInitialDemandOrganizer;
    @FindBy(css = "thead > tr > th:nth-of-type(7)")
    public WebElement headerStatusOrganizer;

    /* the WebElement of the whole table body */
    @FindBy(tagName = "tbody")
    public WebElement tableBodyContent;
    @FindBy(xpath = "//div[@class='o_control_panel']" )
    public WebElement controlPanel;
    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public  WebElement createButton;
    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[1]")
    public WebElement listButton;
    @FindBy (xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[2]")
    public WebElement gridButton;

    @FindBy(xpath = "//th[contains(text(),'Initial Demand')]")
    public WebElement initialDemand;
    @FindBy(xpath = "//td[contains(text(),'15.000')]")
    public WebElement initialDemandWhenThereIsItem;
    @FindBy(xpath = "//tbody//tr[17]//td[6]")
    public WebElement initialDemandWhenThereIsNoItem;

    @FindBy(xpath = "//tbody//tr[1]//td[7]")
    public WebElement Status;
    @FindBy(xpath = "//tbody//tr[16]//td[7]")
    public WebElement WhenAvailable;
    @FindBy(xpath = "//tbody//tr[17]//td[7]")
    public WebElement WhenNotAvailable;


    @FindBy(xpath = "//tbody//tr[1]//td[4]")
    public WebElement SrcDoc;
    @FindBy(xpath = "//tbody//tr[9]//td[4]")
    public WebElement NoSrcDoc;

    //TODO the rest of the page

}
