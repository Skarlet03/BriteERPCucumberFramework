package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class VendorBillsPage {
    public VendorBillsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* this is the WebElement for the whole page content */
    @FindBy (className = "table-responsive")
    public WebElement pageContent;

    /* this is the whole header of the content table */
    @FindBy (tagName = "thead")
    public WebElement tableHeaderContent;

    /* this is the List<WebElement> of the table header elements */
    @FindBy (css = "tr >th")
    public List<WebElement> tableHeaderElementsList;
    /* the following are all the header elements of the table, individually */
        @FindBy (css = "tr >th:nth-of-type(1)")
        public WebElement headerCheckAllCheckbox;
        @FindBy (css = "tr >th:nth-of-type(2)")
        public WebElement headerVendorOrganizer;
        @FindBy (css = "tr >th:nth-of-type(3)")
        public WebElement headerBillDateOrganizer;
        @FindBy (css = "tr >th:nth-of-type(4)")
        public WebElement headerNumberOrganizer;
        @FindBy (css = "tr >th:nth-of-type(5)")
        public WebElement headerVendorReferenceOrganizer;
        @FindBy (css = "tr >th:nth-of-type(6)")
        public WebElement headerDueDateOrganizer;
        @FindBy (css = "tr >th:nth-of-type(7)")
        public WebElement headerSourceDocumentOrganizer;
        @FindBy (css = "tr >th:nth-of-type(8)")
        public WebElement headerTotalOrganizer;
        @FindBy (css = "tr >th:nth-of-type(9)")
        public WebElement headerToPayOrganizer;
        @FindBy (css = "tr >th:nth-of-type(10)")
        public WebElement headerStatusOrganizer;


        //create button element added
        @FindBy (xpath = "//button[@accesskey='c']")
        public WebElement createBtn;

   //TODO need to finish the table content elements and methods

}
