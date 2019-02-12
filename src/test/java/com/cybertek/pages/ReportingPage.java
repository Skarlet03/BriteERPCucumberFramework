package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ReportingPage {

    public ReportingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /* the WebElement for the whole page content, can be checked for availability */
    @FindBy (className = "o_content")
    public WebElement pageContent;

    /* the WebElement for the graph within the content, can be checked for availability */
    @FindBy (className = "o_graph")
    public WebElement pageGraph;

    //TODO other elements within the table, need to be able to work with SVG tag

}
