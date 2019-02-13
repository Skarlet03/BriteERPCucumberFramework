@login
Feature: As a POS Manager, I should be able to log in by given login information

   Scenario: Web page should be running normally
    Given  User should be on the login page
    When   User should enter email and password into input box
    Then    User should be able to click login button

