@smoke @user-perspective
Feature: Sub-functionality of Purchases feature

  Background: Steps to land user on the Purchases page
    Given the "user" signs in
    When the user clicks Purchases button
    Then the page title should be "Requests for Quotation - Odoo"

  Scenario: Verify the 'Purchases' button functionality
    And the page URL should contain "purchase.order"

  Scenario: Verify the 'Requests for Quotation' button functionality
    When the user clicks on "Requests for Quotation" button on the side bar
    Then the page title should be "Requests for Quotation - Odoo"
    And the page URL should contain "purchase.order"

  Scenario: Verify the 'Purchase Orders' button functionality
    When the user clicks on "Purchase Orders" button on the side bar
    Then the page title should be "Purchase Orders - Odoo"
    And the page URL should contain "purchase.order"

  Scenario: Verify the 'Vendors' button functionality
    When the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"

  Scenario: Verify the 'Products' button functionality
    When the user clicks on "Products" button on the side bar
    Then the page title should be "Products - Odoo"
    And the page URL should contain "product.template"

  Scenario: Verify the 'Incoming Products' button functionality
    When the user clicks on "Incoming Products" button on the side bar
    Then the page title should be "Incoming Products - Odoo"
    And the page URL should contain "stock.move"

  Scenario: Verify the 'Vendor Bills' button functionality
    When the user clicks on "Vendor Bills" button on the side bar
    Then the page title should be "Vendor Bills - Odoo"
    And the page URL should contain "account.invoice"