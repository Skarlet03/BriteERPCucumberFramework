Feature: As a POS Manager, I should be able to see and modify the “Purchase Orders” on Purchase order page.
  Background: Steps to land user on the 'Purchase order' page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Products" button on the side bar
    Then the page title should be "Products - Odoo"


  Scenario: Verify that 'Products' is visible and clickable
    Then the page URL should contain "product.template"


  Scenario:  Verify that 'Serach' is visible and clickable
    When user clicks on "search" input box
    Then the page URL should contain "product.template"

  Scenario:  Verify that any products  on 'Products' page is visible and clickable
    When user clicks on "Car Travel Expenses" product
    Then the page URL should contain "product.template"

  Scenario:  Verify that ‘Print’ button on 'Products' page is visible and clickable
    Given user clicks on "Car Travel Expenses" product
    When user clicks on "Print" button on sub-navigation bar
    Then the page URL should contain "report.client_action"


  Scenario:  Verify that 'Send message' function is available and active on 'Products' page
    Given user clicks on "Car Travel Expenses" product
    When user clicks on "Send message" button on sub-navigation bar
    And user input messege "some messsge"
    And user clicks on "Send" button
    Then the page should display "some messsge" messege in the list


  Scenario:  Verify that 'Send message' function is available and active on 'Products' page
    Given user clicks on "Car Travel Expenses" product
    When user clicks on "Schedule Activity" button on sub-navigation bar
    Then "Activity" window should open