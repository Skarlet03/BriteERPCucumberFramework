package com.cybertek.step_definitions;


import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.cybertek.pages.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;




public class Brit_4128_4130_StepsDefinitions {
    LoginPage loginPage;
    HomePage homePage;

    SideBar sideBar;
    PurchaseOrdersPage purchaseOrdersPage = new PurchaseOrdersPage();
    Actions actions = new Actions(Driver.getDriver());

    //brit_4128

    @When("user clicks on purchase order by reference number")
    public void user_clicks_on_purchase_order_by_reference_number  ()  throws Exception {
        String title ="Purchase Orders";
        BrowserUtils.pageTitleContains(title, 15);
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.sendKeys(Keys.PAGE_DOWN);
        purchaseOrdersPage.refNumber.click();
    }


    @Then("{string}  header should be displayed")
    public void header_should_be_displayed(String string) {
        String title ="PO00010";
        BrowserUtils.pageTitleContains(title, 15);
        String actualDate= purchaseOrdersPage.scheduleDate.getText();
        System.out.println(string);
        System.out.println(actualDate);
        Assert.assertEquals(actualDate, string);

    }




    @When("user clicks on {string} tab within the form")
    public void user_clicks_on_tab_within_the_form(String tab_name) {
        String title = "PO00010";
        BrowserUtils.pageTitleContains(title, 15);
        String expectedUrl = "http://52.39.162.23/web?#id=10&view_type=form&model=purchase.order&menu_id=519&action=696";

        switch (tab_name) {
            case "Deliveries&Invoices":
                purchaseOrdersPage.deliveriesAndInvoicesBtn.click();
                String currentUrl = Driver.getDriver().getCurrentUrl();
                Assert.assertEquals(currentUrl, expectedUrl);
                System.out.println("1");

                break;
            case "send message":
                purchaseOrdersPage.sendMessageBtn.click();
                currentUrl = Driver.getDriver().getCurrentUrl();
                Assert.assertEquals(currentUrl, expectedUrl);

                break;

            case "schedule activity":
                purchaseOrdersPage.scheduleActivityBtn.click();
                currentUrl = Driver.getDriver().getCurrentUrl();
                Assert.assertEquals(currentUrl, expectedUrl);
                break;


        }

    }
//    //brit-4130


    @When("user clicks on {string} button on sub-navigation bar")
    public void user_clicks_on_button_on_sub_navigation_bar(String string) {
        String title ="Purchase Orders";
        BrowserUtils.pageTitleContains(title, 15);
        purchaseOrdersPage.createButton.click();


    }


    @When("user clicks on {string} tab within the new form")
    public void user_clicks_on_tab_within_the_new_form(String string) {
        purchaseOrdersPage.addAnItemBtn.click();
        String expectedUrl = "http://52.39.162.23/web?#id=&view_type=form&model=purchase.order&menu_id=519&action=696";
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);

    }


    @When("user clicks on {string} input box")
    public void user_clicks_on_input_box(String string) {
        String title ="Purchase Orders";
        BrowserUtils.pageTitleContains(title, 15);
        purchaseOrdersPage.createButton.click();


    }

    @Then("input box should contain {string} text")
    public void input_box_should_contain_text(String string) {
        String expectedText="Search...";
        String  actualText=purchaseOrdersPage.searchInputBox.getAttribute("placeholder");
        Assert.assertEquals(expectedText,actualText);

    }

    @Then("header drop options should contain {string} button")
    public void header_drop_options_should_contain_button(String string) {
        String title ="Purchase Orders";
        BrowserUtils.pageTitleContains(title, 15);
        purchaseOrdersPage.advancedSearchButton.click();
        String actualText=purchaseOrdersPage.favoriteButton.getText();
        String expectedText="Favorites";
        Assert.assertEquals(expectedText,actualText);


    }


}














