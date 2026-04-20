Feature: Experience Tests


  Scenario: Add Experience Form Labels Check
    Given The user is on the login page
    When The user logins with "hgezer@gmail.com" and "Hg12345678"
    Then The user should be able to see "Hasan Gezer" on dashboard page
    When The user clicks on tab: "Hasan Gezer" and module: "My Profile"
    Then The user should be able to see related page title with two parts: "User Profile"
    When The user navigates user profile tab menu with: "Add Experience"
    Then The user should be able to verify add experience form labels with following list
      | Job Title *     |
      | Company *       |
      | Location        |
      | From Date       |
      | To Date         |
      | Job Description |
