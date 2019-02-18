Feature: As a user, I should be able to get contacts and addresses from the vendors main data page.
  Background: Steps to land user on the 'Purchase order' page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"

  Scenario: Verify that click on Print button will print out vendors sales data
    Given user clicks on "china export" vendor
    When user clicks on "Print" button on sub-navigation bar
    And user clicks on "Due Payment" button on sub-navigation bar
    And user clicks on "Print" button on sub-navigation bar
    Then "Printing is unable" error popup should be displayed

  Scenario: Verify that 'Attachment(s)' dropdown contains  'Add' button by default.
    Given user clicks on "china export" vendor
    When user clicks on "Attachment(s)" button on sub-navigation bar
    Then header drop options should contain "Add" button

  Scenario: Verify that click on Action button will display dropdown menu
    Given user clicks on "china export" vendor
    When user clicks on "Action" button on sub-navigation bar
    Then header drop options should contain "Duplicate" button