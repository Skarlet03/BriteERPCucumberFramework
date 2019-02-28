package com.cybertek.step_definitions;

import com.cybertek.pages.VendorsPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BRIT_4155_4156 {

    VendorsPage vendorsPage = new VendorsPage();

    @Then("{string} button is displayed")
    public void button_is_displayed(String name) {
        Assert.assertTrue(vendorsPage.getTabButton(name).isDisplayed());
    }

    @When("user clicks on {string} button on sub-navigation menu bar")
    public void user_clicks_on_button_on_sub_navigation_menu_bar(String button) {
        switch (button){
            case "Attachment(s)":
                vendorsPage.attachmentsButton.click();
                break;
            case  "Print":
                vendorsPage.printButton.click();
                break;
            case  "Action":
                vendorsPage.actionButton.click();
                break;
        }
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String button) {
        vendorsPage.getTabButton(button).click();
    }

    @Then("{string} error popup should be displayed")
    public void error_popup_should_be_displayed(String string) {
        String message = vendorsPage.deleteWarning.getText();
        Assert.assertEquals(string,message);
    }


}
