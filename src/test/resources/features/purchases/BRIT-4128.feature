Feature: As a POS Manager, I should be able to see and modify the “Purchase Orders” on Purchase order page.
  Background: Steps to land user on the 'Purchase order' page
    Given the "manager" signs in
    When the user clicks Purchases button
    And the user clicks on "Purchase Orders" button on the side bar
    Then the page title should be "Purchase Orders - Odoo"

  Scenario: Verify that 'Purchase Orders' is visible and clickable
    Then the page URL should contain "purchase.order"


  Scenario:  Verify that 'Schedule Date' is visible within the functionality
    When user clicks on purchase order by reference number PO00010
    Then "Scheduled Date"  header should be displayed

  Scenario Outline:  Verify that 'Deliveries&Invoices' tab is clickable within the functionality
    Given user clicks on purchase order by reference number PO00010
    When user clicks on "<tab_name>" tab within the form
    Then the page URL should contain "purchase.order"
    Examples:
      |tab_name|
      |Deliveries&Invoices|
      |send message|
      |schedule activity|
      |log note|