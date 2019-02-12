package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class VendorsPage {
    public VendorsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Log In page locators for my login method:
    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    public WebElement signIn;

    @FindBy (xpath = "//input[@id='login']")
    public WebElement username;


    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement logInBtn;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    public WebElement selectBtn;

    @FindBy(xpath = "//a[contains(text(), 'BriteErpDemo')]")
    public WebElement briteErpDemoDropDownBtn;

    @FindBy(xpath = "//span[contains(text(), 'Purchases')]")
    public WebElement purchasesBtn;



// Home | Website localhost   (Sign In)     http://52.39.162.23/
// Home | Website localhost   (Log In)      http://52.39.162.23/web/login
// Odoo                                     http://52.39.162.23/web/database/selector
// Home | Website localhost (BriteErpDemo)  http://52.39.162.23/web/login
// #Inbox - Odoo                            http://52.39.162.23/web?#menu_id=115&action=120&active_id=channel_inbox
// Requests for Quotation - Odoo            http://52.39.162.23/web?#view_type=list&model=purchase.order&menu_id=518&action=695
// Vendors - Odoo                           http://52.39.162.23/web?#view_type=kanban&model=res.partner&menu_id=506&action=50



    //OPENING URL METHOD:
    public void openUrl(){
        Driver.getDriver().get("http://52.39.162.23/");
    }


    //SIGNING IN METHOD:
    public void signIn() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 100);
        signIn.click();
        wait.until(ExpectedConditions.urlToBe("http://52.39.162.23/web/login"));
        selectBtn.click();
        wait.until(ExpectedConditions.urlToBe("http://52.39.162.23/web/database/selector"));
        briteErpDemoDropDownBtn.click();
    }

    //LOGGING IN METHOD:
    public void login(String usernameText, String passwordText){
        this.username.sendKeys(usernameText);
        this.password.sendKeys(passwordText);
        logInBtn.click();
    }



    //COMMON LOCATORS:

    public WebElement getModuleDefaultPageHeader(String modulePageHeader){
        String xpath = "//li[contains(text(),'" + modulePageHeader + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));

    }

    public WebElement getModuleDefaultPageFilterText(String defaultFilterText){
        String xpath = "//span[contains(text(), '" + defaultFilterText + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


    @FindBy (xpath = "//span[@class='fa fa-filter o_searchview_facet_label']")
    public WebElement moduleDefaultPageFilterButton;


    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement moduleDefaultPageSearchInputBox;


    public WebElement getVendorPageTopBtn(String buttonName){
        String xpath = "(//button[contains(text(),'" + buttonName + "')])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


    //USER PERSPECTIVE TEST CASES:


    public WebElement getVendorPageTopDropdownBtn(String buttonName){
        String xpath = "//button[contains(text(),'" + buttonName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//a[contains(text(), 'Due Payments')]")
    public WebElement duePaymentsDropdownMenuBtn;

    @FindBy(xpath = "//li[contains(text(), 'Due Payments')]")
    public WebElement duePaymentsPage;

    @FindBy (xpath = "//div[@class='o_notification_manager']")
    public WebElement unableToPrintReportPage;

    @FindBy(xpath = "//form[@class='o_form_binary_form']")
    public WebElement addDropdownMenuBtn;

    public WebElement getAttachedFile(String fileName){
        String xpath = "//a[contains(text(), ' " + fileName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getDropdownMenuElement(String dropdownMenuElement){
        String xpath = "//a[contains(text(), '" + dropdownMenuElement + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }



    public WebElement getCurrentVendorCompanyName(String companyName){
        String xpath = "//span[contains(text(), '" + companyName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));

    }

    @FindBy(xpath = "//span[contains(text(), 'China Export')]")
    public WebElement vendorCompanyName;

    public WebElement getCurrentVendorHeaderCompanyName (String name){
        String xpath = "//li[.='" + name + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[1]")
    public WebElement sendMessageBtn;

    @FindBy(xpath = "//textarea[@class='o_input o_composer_text_field']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")
    public WebElement sendBtn;

    public WebElement getSentMessage(String message){
        String xpath = "//p[contains(text(), '" + message + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//h4[contains(text(), 'Odoo')]")
    public WebElement scheduleActivityPage;

    @FindBy(xpath = "//input[@id='o_field_input_2077']")
    public WebElement activityInputBox;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[2]")
    public WebElement logNoteBtn;

    @FindBy(xpath = "//textarea[@class='o_input o_composer_text_field']")
    public WebElement logBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_composer_button_send hidden-xs']")
    public WebElement logBtn;

    @FindBy(xpath = "//div[@class='o_chatter_topbar']/button[3]")
    public WebElement scheduleActivityBtn;


    public WebElement getCurrentVendorEmailsOrWebsites(String emailOrWebsite){
        String xpath = "//a[contains(text(), '" + emailOrWebsite + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getCurrentVendorNavTabs(String formNavTagName){
        String xpath = "//a[contains(text(), '" + formNavTagName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getContactName(String contactName){
        String xpath = "//span[contains(text(), '" + contactName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getOpenContactsPage(String openContactPage){
        String xpath = "//h4[contains(text(), '" + openContactPage + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }




    //MANAGER PERSPECTIVE TEST CASES:

    public WebElement getVendorFormRadioBtn(String RadioBtnName) {
        String xpath = "//label[contains(text(), '" + RadioBtnName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//input[@data-value='person']")
    public WebElement individualRadioButton;

    @FindBy(xpath = "//input[@data-value='company']")
    public WebElement businessRadioButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement vendorFormCompanyNameBox;


    public WebElement getVendorFormRightTopBtn(String formTopBtnName){
        String xpath = "//span[contains(text(), '" + formTopBtnName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


    public WebElement getVendorFormLabelNames(String formLabelName){
        String xpath = "//label[contains(text(), '" + formLabelName + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "(//label[contains(text(), 'Address')])[2]")
    public WebElement vendorFormAddressLabelName;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vendorFormCompanyDropdownBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement vendorFormStateDropdownBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement vendorFormCountryDropdownBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement vendorFormTagsDropdownBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")
    public WebElement vendorFormTitleDropdownBtn;

    @FindBy(xpath = "//select[@name='lang']")
    public WebElement vendorFormSelectBtn;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetInputBox;

    @FindBy(xpath = "//input[@name='street2']")
    public WebElement street2InputBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInputBox;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipInputBox;

    @FindBy(xpath = "//input[@name='vat']")
    public WebElement tinInputBox;

    @FindBy(xpath = "//input[@name='function']")
    public WebElement jobPositionInputBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobileInputBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement createTag;


    @FindBy(xpath = "(//button[@class='btn btn-primary btn-sm o_form_button_save'])[1]")
    public WebElement saveForm;


    @FindBy(xpath = "//h1/span")
    public WebElement newVendorHeaderName;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement websiteInputBox;


    @FindBy(xpath = "(//button[contains(text(),'Create')])")
    public WebElement vendorFormCreateBtn;

    public List<WebElement> inputFields(){
        List<WebElement> list = new ArrayList<>();
        for (int i = 4; i<21; i++){
            list.add(Driver.getDriver().findElement(By.xpath("(//input[@type='text'])["+i+"]")));
        }

        return  list;
    }

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement createContactsSheetHeader;

    @FindBy(xpath = "//div[@class = 'oe_kanban_global_click o_res_partner_kanban o_kanban_record']")
    public List<WebElement> vendorsList;

    @FindBy(xpath = "//strong/span")
    public List<WebElement> vendorsNames;


    @FindBy(xpath = "//button[@class='close']")
    public WebElement createContactsSheetCloseBtn;

    public WebElement getCreateContactsSheetRadioBtn(String name){
        String xpath = "(//label[contains(text(), '" + name + "')])[1]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getCreateContactsSheetLabelNames(String name){
        String xpath = "//label[contains(text(), '" + name + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement getCreateContactsSheetBottomBtn(String name){
        String xpath = "//span[contains(text(), '" + name + "')]";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }



}
