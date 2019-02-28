package com.cybertek.step_definitions;

import com.cybertek.pages.NewRFQPage;
import com.cybertek.pages.RequestsForQuotation;
import com.cybertek.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.List;

public class BRIT_3992_Steps {
    private String randomInput = new Faker().starTrek().character();

    @Then("the system should display Create button")
    public void the_system_should_display_Create_button() {
        Assert.assertTrue(new RequestsForQuotation().createButton.isDisplayed());
    }

    @When("the user clicks Create button")
    public void the_user_clicks_Create_button() {
        new RequestsForQuotation().createButton.click();
    }

    @Then("the system should display Vendor dropdown box")
    public void the_system_should_display_Vendor_dropdown_box() {
        Assert.assertTrue(new NewRFQPage().vendorDropdown.isDisplayed());
    }

    @Given("the Vendor dropdown box is blank by default")
    public void the_Vendor_dropdown_box_is_blank_by_default() {
        Assert.assertTrue(new NewRFQPage().vendorDropdown.getText().isEmpty());
    }

    @When("the user clicks on Vendor dropdown box")
    public void the_user_clicks_on_Vendor_dropdown_box() {
        new NewRFQPage().vendorDropdown.click();
    }

    @Then("the Vendor dropdown box displays list of Vendors")
    public void the_Vendor_dropdown_box_displays_list_of_Vendors() {
        Assert.assertTrue(new NewRFQPage().vendorDDFirstElement.isDisplayed());
    }

    @Then("the system should display Vendor Reference text input")
    public void the_system_should_display_Vendor_Reference_text_input() {
        Assert.assertTrue(new NewRFQPage().vendorReferenceInput.isDisplayed());
    }

    @Then("the Vendor Reference text input is blank")
    public void the_Vendor_Reference_text_input_is_blank() {
        Assert.assertTrue(new NewRFQPage().vendorReferenceInput.getText().isEmpty());
    }

    @Then("the Vendor Reference text input accepts user input")
    public void the_Vendor_Reference_text_input_accepts_user_input() {
        new NewRFQPage().vendorReferenceInput.sendKeys(randomInput);
    }

    @Then("the Vendor Reference text input stores user input")
    public void the_Vendor_Reference_text_input_stores_user_input() {
        Assert.assertEquals(randomInput,
                new NewRFQPage().vendorReferenceInput.getAttribute("value"));
    }

    @Then("the system should display Products section")
    public void the_system_should_display_Products_section() {
        Assert.assertTrue(new NewRFQPage().productsTableSection.isDisplayed());
    }

    @Then("the Products sections should have the given {string}")
    public void the_Products_sections_should_have_the_given(String str, List<String> expected) {
        List<String> actualList = BrowserUtils.getElementsText(
                new NewRFQPage().tableHeadersList);

        Assert.assertEquals(expected, actualList);
    }
}
