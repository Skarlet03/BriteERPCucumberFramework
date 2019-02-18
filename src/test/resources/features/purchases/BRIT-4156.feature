Feature: As a POS Manager, I should be able to perform actions on Vendor's details page
  Background: Steps to land user on the 'Purchase order' page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"

  Scenario Outline: Verify that click on Action button will display available options
    Given user clicks on "random" vendor
    When user clicks on "Action" button on sub-navigation bar
    Then header drop options should contain "<dropButton>" button

    Examples:
      |dropButton|
      |Delete|
      |Duplicate|
      |Subscribe|
      |Add Invoices|
      |Journal Items|
      |Portal Access Managment|
      |Send SMS|

  Scenario: Verify that click on All Invoices button will open invoice page
    Given user clicks on "random" vendor
    When user clicks on "Action" button on sub-navigation bar
    And user clicks on "All invoices" button
    Then the page title should be "All Invoices - Oddo"
    And the page URL should contain "account.invoice"


  Scenario: Verify that click on Delete button will open popup "Are you sure you want to delete this record ?"
    Given user clicks on "random" vendor
    When user clicks on "Action" button on sub-navigation bar
    And user clicks on "Delete" button
    Then "Are you sure you want to delete this record ?" error popup should be displayed
