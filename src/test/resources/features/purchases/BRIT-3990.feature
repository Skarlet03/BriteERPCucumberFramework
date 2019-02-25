#Acceptance Criteria:
	# # Verify that 'Purchases' tab visible from the top navigation tab
	# # Verify that 'Requests for Quotation' becomes available and clickable on the left navigation tab
	# # Verify that quotation requests are listed on the main screen
	# # Verify that each request has the following information displayed:
	# ## Reference (unique Purchase Order (PO) number)
	# ## Order Date (format: DD/MM/YYYY 24:59:59)
	# ## Vendor (name of the vendor)
	# ## Scheduled Date (format: DD/MM/YYYY 24:59:59)
	# ## Source Document
	# ## Untaxed (total amount, before taxes)
	# ## Total (total amount, with taxes)
	# ## Status (RFQ, RFQ Sent, Purchase Order, Cancelled)"
	# # Verify that total untaxed and total (taxed) amounts are displayed below the table.

@BRIT-3990 @McLean @Purchases @regression
Feature: As a POS Manager, I should be able to see all 'Requests for Quotation'
  within 'Purchases' page

  Scenario Outline: Verify that 'Purchases' tab is visible and clickable
  from the top navigation tab
    Given the user goes to URL
    And the user chooses BriteErpDemo database
    And the "<user>" enters valid email
    And the "<user>" enters valid password
    And the user clicks Log in button
    Then the page title should be "#Inbox - Odoo"
    When the user clicks Purchases button
    Then the page title should be "Requests for Quotation - Odoo"

    Examples:
      |user   |
      |user   |
      |manager|

  Scenario: Verify that 'Requests for Quotation' is availabLe and clickable on the left navigation bar
    Given the "user" signs in
    When the user clicks Purchases button
    Then the page title should be "Requests for Quotation - Odoo"
    And the 'Requests for Quotation' should be displayed on the Left Navigation Bar
    When the user clicks on "Requests for Quotation" button on the side bar
    Then the 'Requests for Quotation' should be displayed on the main panel

  Scenario: Verify that each request has the given pre-determined information displayed
    Given the "user" signs in
    And the user clicks Purchases button
    Then the page title should be "Requests for Quotation - Odoo"
    And the Requests for Quotation table is displayed
    And tge Requests for Quotation table has the following "headings"
      | Reference       |
      | Order Date      |
      | Vendor          |
      | Scheduled Date  |
      | Source Document |
      | Untaxed         |
      | Total           |
      | Status          |

  Scenario: Verify that total untaxed and total (taxed) amounts are displayed below the table
    Given the "user" signs in
    And the user clicks Purchases button
    And the page title should be "Requests for Quotation - Odoo"
    And the Requests for Quotation table is displayed
    Then the Requests for Quotation table has the following "total amounts" displayed
      | Untaxed |
      | Taxed   |