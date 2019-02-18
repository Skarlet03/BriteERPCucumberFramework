Feature: As a POS Manager, I should be able to see all 'Vendor Bills' within 'Purchases' page
  Background: Steps to land user on the 'Vendor Bills' page
    Given the "manager" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendor Bills" button on the side bar
    Then the page title should be "Vendor Bills Orders - Odoo"

  Scenario: Verify that 'Vendor Bills' becomes available and clickable
    Then the page URL should contain "account.invoice"
    And main display has a table of Vendor Bills


  Scenario:  Verify that 'Total' and 'Pay to' amounts are displayed below the table
    Then "Total" column should have total amount displayed
    Then "To Pay" column should have total amount displayed

