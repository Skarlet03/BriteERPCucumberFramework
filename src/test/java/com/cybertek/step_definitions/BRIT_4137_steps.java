package com.cybertek.step_definitions;

import com.cybertek.pages.VendorsPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BRIT_4137_steps {
    VendorsPage vendorsPage = new VendorsPage();

    @When("user clicks on {string} vendor")
    public void user_clicks_on_vendor(String name) {
       vendorsPage.getCurrentVendorCompanyName(name).click();
       BrowserUtils.pageTitleContains("China Export - Odoo", 10);
       Assert.assertTrue("Not found", Driver.getDriver().getTitle().contains(name));
       Assert.assertTrue("Not found", Driver.getDriver().getCurrentUrl().contains("res.partner"));
    }

    @When("user clicks on {string} contact")
    public void user_clicks_on_contact(String contactName) {
        vendorsPage.getContactsName(contactName).click();
    }

    @Then("Contacts page should open")
    public void contacts_window_should_open() {
        Assert.assertTrue(vendorsPage.contactsPage.isDisplayed());
    }

    @Then("{string}  header should be displayed")
    public void header_should_be_displayed(String header) {
        Assert.assertTrue(vendorsPage.getOpenContactsPage(header).isDisplayed());
    }

    @Then("{string} contact name should be displayed")
    public void contact_name_should_be_displayed(String name) {
      Assert.assertTrue(vendorsPage.getContactsNameOnContactsPage(name).isDisplayed());
    }


}
