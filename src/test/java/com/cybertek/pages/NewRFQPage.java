package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class NewRFQPage {
    public NewRFQPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* here are the WebElements of Status Bar */
        @FindBy (className = "o_form_statusbar")
        public WebElement statusBarElement;

        // need to find other elements on the go //

    /* here are the WebElements of the Main Form */
    // elements will be found and populated on the go, per tests //
    @FindBy (name = "partner_id")
    public WebElement vendorDropdown;

    @FindBy (css = ".ui-autocomplete >li")
    public WebElement vendorDDFirstElement;

    @FindBy (css = ".o_datepicker")
    public WebElement orderDateDDInput;

    @FindBy (name = "partner_ref")
    public WebElement vendorReferenceInput;

    @FindBy (css = ".nav-tabs >li:nth-of-type(1)")
    public WebElement productsTableSection;

    @FindBy (css = ".nav-tabs >li:nth-of-type(2)")
    public WebElement deliveriesAndInvoicesTableSection;

    @FindBy (className = "o_column_sortable")
    public List<WebElement> tableHeadersList;
}
