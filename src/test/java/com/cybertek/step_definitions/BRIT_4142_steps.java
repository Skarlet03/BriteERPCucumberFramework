package com.cybertek.step_definitions;

import com.cybertek.pages.VendorsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BRIT_4142_steps {

    VendorsPage vendorsPage = new VendorsPage();

    @Given("user clicks on Send message in sub-navigation bar")
    public void user_clicks_on_Send_message_in_sub_navigation_bar() {
        vendorsPage.sendMessageBtn.click();
    }

    @Given("user clicks on Log note in sub-navigation bar")
    public void user_clicks_on_Log_note_in_sub_navigation_bar() {
        vendorsPage.logNoteBtn.click();
    }

    @When("user clicks on Schedule Activity in sub-navigation bar")
    public void user_clicks_on_Schedule_Activity_in_sub_navigation_bar() {
        vendorsPage.scheduleActivityBtn.click();
    }

    @When("user input message {string}")
    public void user_input_message(String message) {
        vendorsPage.messageBox.sendKeys(message);
    }

    @When("user clicks on Send button")
    public void user_clicks_on_Send_button() {
       vendorsPage.sendBtn.click();
    }

    @When("user clicks on Log button")
    public void user_clicks_on_Log_button() {
       vendorsPage.logBtn.click();
    }


    @Then("the box should display {string}")
    public void the_box_should_display(String text) {
        Assert.assertTrue(vendorsPage.getSentMessage(text).isDisplayed());
    }


    @Then("{string} window should be opened")
    public void window_should_be_opened(String string) {
        Assert.assertTrue(vendorsPage.scheduleActivityPage.isDisplayed());
    }
}
