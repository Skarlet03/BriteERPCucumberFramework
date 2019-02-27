
Feature: As a user, I should be able to get contacts and addresses from the vendors main data page.

  Background: Steps to land user on the 'Purchase order' page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    Then the page URL should contain "res.partner"

  Scenario: Verify that a click on each vendors icon displays vendors data in a new page
    When user clicks on "China Export" vendor
    Then the page title should be "China Export - Odoo"
    And the page URL should contain "res.partner"

  Scenario: Verify that vendors 'Contacts and Addresses' are available on the main vendors data page by default.
    Given user clicks on "China Export" vendor
    When user clicks on "Chao Wang" contact
    Then Contacts page should open
    And "Open: Contacts"  header should be displayed
    Then "Chao Wang" contact name should be displayed