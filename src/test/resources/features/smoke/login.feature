#@smoke @login
#Feature: Application is up and running, and users can log in

#  Scenario: Verify the URL is responsive
#    When the user goes to URL
#    Then the page title should be "Odoo"
#    And the page URL should contain "database/selector"

#  Scenario Outline: Verify 'Log in' functionality
#    Given the user goes to URL
#    And the user chooses BriteErpDemo database
#    When the "<valid user>" enters valid email
#    And the "<valid user>" enters valid password
#    And the user clicks Log in button
#    Then the page title should be "#Inbox - Odoo"
#     And the page URL should contain "active_id"
#
#    Examples: valid user types
#      | valid user |
#      | manager    |
#      | user       |



  Feature: Application is up and running, and users can log in

  Scenario: Verify the URL is responsive
    When the user goes to URL
    Then the page title should be "Home | Website localhost"
    And the page URL should contain "http://54.148.96.210/"

  Scenario Outline: Verify 'Log in' functionality
    Given the user goes to URL
    And the user chooses Sign in
    When the "<valid user>" enters valid email
    And the "<valid user>" enters valid password
    And the user clicks Log in button
    Then the page title should be "#Inbox - Odoo"
    And the page URL should contain "active_id"

    Examples: valid user types
      | valid user |
      | manager    |
      | user       |