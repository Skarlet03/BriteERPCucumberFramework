package com.cybertek.step_definitions;

import com.cybertek.pages.*;
import com.cybertek.utilities.*;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SmokeSuiteSteps {
    private String userType;
    private String username;
    private String password;

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
        switch (user) {
            case "user":
                userType = user;
                username = ConfigurationReader.getProperty("user-username");
                break;
            case "manager":
                userType = user;
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
        switch (user) {
            case "user":
                userType = user;
                password = ConfigurationReader.getProperty("user-login");
                break;
            case "manager":
                userType = user;
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

    @Given("the {string} signs in")
    public void the_signs_in(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        new EntryPage().brietErpDemoAnchor.click();

        switch (user) {
            case "user":
                userType = user;
                username = ConfigurationReader.getProperty("user-username");
                password = ConfigurationReader.getProperty("user-login");
                break;
            case "manager":
                userType = user;
                username = ConfigurationReader.getProperty("manager-username");
                password = ConfigurationReader.getProperty("manager-password");
                break;
            default:
                throw new RuntimeException("You can login either as 'User' or 'Manager'");
        }

        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.logIn.click();

        BrowserUtils.pageTitleContains("#Inbox - Odoo", 10);
    }

    @When("the user clicks Purchases button")
    public void the_user_clicks_Purchases_button() {
        new HeaderNavigationBar().purchases.click();
    }

    @When("the user clicks on {string} button on the side bar")
    public void the_user_clicks_on_button_on_the_side_bar(String sideButton) {
        SideBar sideBar = new SideBar();
        WebElement toClick = null;

        switch (sideButton) {
            case "Requests for Quotation":
                toClick = sideBar.requestsForQuotationLink;
                break;
            case "Purchase Orders":
                toClick = sideBar.purchaseOrdersLink;
                break;
            case "Vendors":
                toClick = sideBar.vendorsLink;
                break;
            case "Products":
                toClick = sideBar.products;
                break;
            case "Incoming Products":
                toClick = sideBar.incomingProductsLink;
                break;
            case "Vendor Bills":
                toClick = sideBar.vendorBillsLink;
                break;
            case "Reporting":
                toClick = sideBar.reportingLink;
                break;
            default:
                throw new RuntimeException("No such button to click on the Side Bar");
        }

        toClick.click();
    }
}
