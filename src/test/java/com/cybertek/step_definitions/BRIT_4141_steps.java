package com.cybertek.step_definitions;

import com.cybertek.pages.VendorsPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BRIT_4141_steps {
    VendorsPage vendorsPage = new VendorsPage();

    @When("user clicks on {string} button on top-navigation bar")
    public void user_clicks_on_button_on_sub_navigation_bar(String buttonName) {
        BrowserUtils.pageTitleContains("China Export - Odoo", 10);
        vendorsPage.getTopNavBtn(buttonName).click();
    }

    @Then("Due Payments dropdown button should be displayed")
    public void due_payment_dropdown_button_should_be_displayed() {
        BrowserUtils.pageTitleContains("China Export - Odoo", 10);
        Assert.assertTrue(vendorsPage.duePaymentsDropdownBtn.isDisplayed());
    }

    @Then("Add dropdown button should be displayed")
    public void add_dropdown_button_should_be_displayed() {
        BrowserUtils.pageTitleContains("China Export - Odoo", 10);
        Assert.assertTrue(vendorsPage.addDropdownBtn.isDisplayed());
    }

    @Then("Duplicate dropdown button should be displayed")
    public void duplicate_dropdown_button_should_be_displayed() {
        BrowserUtils.pageTitleContains("China Export - Odoo", 10);
        Assert.assertTrue(vendorsPage.duplicateDropdownBtn.isDisplayed());
    }



}
