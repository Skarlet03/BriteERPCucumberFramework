package com.cybertek.step_definitions;

import com.cybertek.pages.EntryPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//This class only for testing Framework, please ignore!
public class test_stepDefinition {

        @Given("User should be on the login page")
        public void user_should_be_on_the_login_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            EntryPage entryPage = new EntryPage();
            entryPage.brietErpDemoAnchor.click();
        }

        @When("User should enter email and password into input box")
        public void user_should_enter_email_and_password_into_input_box() {
            LoginPage loginPage = new LoginPage();
            loginPage.username.sendKeys(ConfigurationReader.getProperty("manager-username"));
            loginPage.password.sendKeys(ConfigurationReader.getProperty("manager-password"));
        }

        @Then("User should be able to click login button")
        public void user_should_be_able_to_click_login_button() {
            LoginPage loginPage = new LoginPage();
            loginPage.logIn.click();
        }


    }
