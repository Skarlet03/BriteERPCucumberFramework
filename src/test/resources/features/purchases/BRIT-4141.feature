@wip
Feature: As a user, I should be able to get contacts and addresses from the vendors main data page.

  Background: Steps to land user on the 'Purchase order' page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"

  Scenario: Verify that click on Print button will print out vendors sales data
    Given user clicks on "China Export" vendor
    When user clicks on "Print" button on top-navigation bar
    Then Due Payments dropdown button should be displayed

  Scenario: Verify that 'Attachment(s)' dropdown contains  'Add' button by default.
    Given user clicks on "China Export" vendor
    When user clicks on "Attachment(s)" button on top-navigation bar
    Then Add dropdown button should be displayed

  Scenario: Verify that click on Action button will display dropdown menu
    Given user clicks on "China Export" vendor
    When user clicks on "Action" button on top-navigation bar
    Then Duplicate dropdown button should be displayed
