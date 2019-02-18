Feature: As a POS Manager, I should be able to 'Create' new 'Vender Bills'
  Background: Steps to land user on the 'Vendor Bills' page
    Given the "manager" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendor Bills" button on the side bar
    Then the page title should be "Vendor Bills Orders - Odoo"
    And the page URL should contain "account.invoice"

  Scenario: Verify that 'Create' button is visible on the 'Vendor Bills' page
    Given "Create" button is displayed
    When user clicks on "Create" button on sub-navigation bar
    Then the page title should be "New - Odoo"


  Scenario:  Verify after clicking "Create" button manager should be taken to the Create  page
    When user clicks on "Create" button on sub-navigation bar
    Then "Save" sub-navigation button is displayed
    And "Discard" sub-navigation button is displayed

  Scenario Outline:  Verify after clicking "Create" button manager should be taken to the Create  page
    When user clicks on "Create" button on sub-navigation bar
    Then "<dropdown name>"  dropdown should be displayed

    Examples:
      |dropdown name|
      |Vendor Reference|
      |Bill Date|
      |Due Date|
      |Add Purchase Oder|

  Scenario Outline:  Verify that 'Bill' table is contains following columns are displayed
    When user clicks on "Create" button on sub-navigation bar
    Then "<header name>"  header should be displayed
    And "Add an item" button is displayed

    Examples:
      |header name|
      |product|
      |Description|
      |Quantity|
      |Unit Price|
      |Taxes|
      |Amount|


  Scenario:   Verify that 'Vendor Bills/ New' page's text inputs are available and accept user input
    Given user clicks on "Create" button on sub-navigation bar
    When user clicks on "Vendor Bills/ New" button on sub-navigation bar
    And user input messege "vendor reference"
    Then input box should contain "vendor reference" text

  Scenario:   Verify that 'Vendor Bills/ New' page's text inputs are available and accept user input
    Given user clicks on "Create" button on sub-navigation bar
    When user clicks on "Additional notes" button on sub-navigation bar
    And user input messege "some notes"
    Then input box should contain "some notes" text

  Scenario:    Verify that "Import" button is clickable and manager should be able to import CVS or Excel Files.
    When user clicks on "Import" button on sub-navigation bar
    Then the page title should be "Import a File - Odoo"

  Scenario:    Verify that "Import" button is clickable and manager should be able to import CVS or Excel Files.
    Given user clicks on "Import" button on sub-navigation bar
    When user clicks on "Load File" button on sub-navigation bar
    Then system File option window should open
