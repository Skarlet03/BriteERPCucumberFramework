
Feature: As a user, I should be able to upload files to vendors data page.

  Background: Steps to land user on the  "china export" vendor page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"
    Given user clicks on "China Export" vendor

  Scenario: Verify that Send message navigation tab allows to send messages internally
    Given user clicks on Send message in sub-navigation bar
    When user input message "some message"
    And user clicks on Send button
    Then the box should display "some message"


  Scenario:  Verify that Log note navigation tab allows to log notes internally
    Given user clicks on Log note in sub-navigation bar
    When user input message "some note"
    And user clicks on Log button
    Then the box should display "some note"

  Scenario:  Verify that Schedule Activity navigation tab displays activity schedule page
    When user clicks on Schedule Activity in sub-navigation bar
    Then "Schedule Activity" window should be opened

