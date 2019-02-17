Feature: As a user, I should be able to upload files to vendors data page.
  Background: Steps to land user on the  "china export" vendor page
    Given the "user" signs in
    When the user clicks Purchases button
    And the user clicks on "Vendors" button on the side bar
    Then the page title should be "Vendors - Odoo"
    And the page URL should contain "res.partner"
    Given user clicks on "china export" vendor

  Scenario: Verify that Send message navigation tab allows to send messages internally
    Given user clicks on "Send message" button on sub-navigation bar
    When user input messege "some messsge"
    Then input box should contain "some messsge" text


  Scenario:  Verify that Log note navigation tab allows to log notes internally
    Given user clicks on "Log note" button on sub-navigation bar
    When user input messege "some note"
    And user clicks on "Log" button
    Then the page should display "some note" messege in the list

  Scenario:  Verify that Schedule Activity navigation tab displays activity schedule page
    When user clicks on "Schedule Activity" button on sub-navigation bar
    Then "Schedule Activity" window should open

