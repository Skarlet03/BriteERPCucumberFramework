@BRIT-4130
Feature: As a POS Manager, I should be able to see and modify the “Purchase Orders” on Purchase order page.
  Background: Steps to land user on the 'Purchase order' page
    Given the "manager" signs in
    When the user clicks Purchases button
    And the user clicks on "Purchase Orders" button on the side bar
    Then the page title should be "Purchase Orders - Odoo"
    And the page URL should contain "purchase.order"

  Scenario:  Verify that 'Create' button is clickable
    When user clicks on "Create" button on sub-navigation bar
    Then the page URL should contain "purchase.order"


  Scenario:  Verify that 'add items' button is visible and clickable within Create page
    Given user clicks on "Create" button on sub-navigation bar
    When user clicks on "add item" tab within the new form
    Then the page URL should contain "purchase.order"


  Scenario:  Verify that 'Search' input box is functioning
    When user clicks on "search" input box
    Then input box should contain "Search..." text


  Scenario:  Verify that 'Favorite' button is visible and clickable within Create page
    Then header drop options should contain "Favorite" button