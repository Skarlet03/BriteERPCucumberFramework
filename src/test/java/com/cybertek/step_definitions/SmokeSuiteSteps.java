package com.cybertek.step_definitions;

import com.cybertek.pages.*;
import com.cybertek.utilities.*;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class SmokeSuiteSteps {

    @When("the user goes to URL")
    public void the_user_goes_to_URL() {
        Driver.getDriver().get(
                ConfigurationReader.getProperty("url"));
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String title) {
        BrowserUtils.pageTitleContains(title, 10);
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }

    @Then("the page URL should contain {string}")
    public void the_page_URL_should_contain(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl()
                .contains(url));
    }

    @Given("the user chooses BriteErpDemo database")
    public void the_user_chooses_BriteErpDemo_database() {
        EntryPage entryPage = new EntryPage();
        entryPage.brietErpDemoAnchor.click();
    }

    @When("the {string} enters valid email")
    public void the_enters_valid_email(String user) {
        String username = "";

        switch (user) {
            case "user":
                username = ConfigurationReader.getProperty("user-username");
                break;
            case "manager":
                username = ConfigurationReader.getProperty("manager-username");
                break;
            default:
                throw new RuntimeException("You can only log in as 'User' or 'Manager'");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(username);
    }

    @When("the {string} enters valid password")
    public void the_enters_valid_password(String user) {
        String password = "";

        switch (user) {
            case "user":
                password = ConfigurationReader.getProperty("user-login");
                break;
            case "manager":
                password = ConfigurationReader.getProperty("manager-password");
                break;
            default:
                throw new RuntimeException("You can only log in as 'User' or 'Manager'");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.password.sendKeys(password);
    }

    @When("the user clicks Log in button")
    public void the_user_clicks_Log_in_button() {
        new LoginPage().logIn.click();
    }

}
