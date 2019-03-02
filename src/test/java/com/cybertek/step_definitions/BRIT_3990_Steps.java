package com.cybertek.step_definitions;

import com.cybertek.pages.RequestsForQuotation;
import com.cybertek.pages.SideBar;
import com.cybertek.pages.SubNavigationPage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BRIT_3990_Steps {

    @Then("the {string} should be displayed on the Left Navigation Bar")
    public void the_should_be_displayed_on_the_Left_Navigation_Bar(String str) {
        SideBar sideBar = new SideBar();

        WebElement toClick = null;
        switch (str) {
            case "Requests for Quotation":
                toClick = sideBar.requestsForQuotationLink;
                break;
            default:
                throw new RuntimeException("No such button to click on the Side Bar");
        }

        toClick.click();
    }

    @Then("the {string} should be displayed on the main panel")
    public void the_should_be_displayed_on_the_main_panel(String str) {
        SubNavigationPage subNav = new SubNavigationPage();

        Assert.assertTrue(BrowserUtils.isElementsTextAMatch(
                subNav.pageNameLabel, str, 15));
    }

    @Then("the Requests for Quotation table is displayed")
    public void the_Requests_for_Quotation_table_is_displayed() {
        RequestsForQuotation requests = new RequestsForQuotation();

        Assert.assertTrue(requests.requestForQuotationTable.isDisplayed());
    }

    @Then("the Requests for Quotation table has the following {string}")
    public void the_Requests_for_Quotation_table_has_the_following(String str, List<String> expected) {
        RequestsForQuotation requests = new RequestsForQuotation();

        List<String> actualList = BrowserUtils.getElementsText(
                requests.requestsForQuotationTableHeaders);

        Assert.assertEquals(expected, actualList);
    }

    @Then("the Requests for Quotation table has the following total amount and total taxed amount displayed")
    public void the_Requests_for_Quotation_table_has_the_following_total_amount_and_total_taxed_amount_displayed() {
        RequestsForQuotation requests = new RequestsForQuotation();

        Assert.assertTrue(requests.totalUntaxedAmountLabel.isDisplayed());
        Assert.assertTrue(requests.totalTaxedAmountLabel.isDisplayed());
    }
}
