Feature: As a POS Manager, I should be able to see Vendor's details

  Background: Steps to land user on the 'Vendor Bills' page
    Given the "manager" is logged in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"

  Scenario: Verify that 'Vendors' becomes available and clickable
    Then the page URL should contain "res.partner"


  Scenario:  Verify that user can open any vendor's details
    When user clicks on "random" vendor
    Then the page title should be "randomVendorName - Odoo"

  Scenario Outline:  Verify that user can see different tabs when open any vendor's details
    When user clicks on "random" vendor
    Then "<tabs>" button is displayed

    Examples:
      | tabs                 |
      | Contacts & Addresses |
      | Internal Notes       |
      | Sales & Purchases    |

  Scenario Outline: Verify that click on Print and Attachment(s) button will display available options
    Given user clicks on "random" vendor
    When user clicks on "<header>" button on sub-navigation bar
    Then header drop options should contain "<dropButton>" button
    Examples:
      | header        | dropButton   |
      | Attachment(s) | Add...       |
      | Print         | Due Payments |
