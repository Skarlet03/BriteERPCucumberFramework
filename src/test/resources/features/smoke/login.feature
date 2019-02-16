@smoke @login
Feature: Application is up and running, and users can log in

  Scenario: URL is responsive
    When the user goes to URL
    Then the page title should be "Odoo"
    And the page URL should contain "database/selector"

  Scenario Outline: Log in functionality is responsive
    Given the user goes to URL
    And the user chooses BriteErpDemo database
    When the "<valid user>" enters valid email
    And the "<valid user>" enters valid password
    And the user clicks Log in button
    Then the page title should be "#Inbox - Odoo"
     And the page URL should contain "active_id"

    Examples: valid user types
      | valid user |
      | manager    |
      | user       |