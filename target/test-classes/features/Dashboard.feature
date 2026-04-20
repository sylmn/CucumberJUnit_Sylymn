@regression @forMaven
Feature: Dashboard Tests

  @smoke
  Scenario: Developers Page Test
    Given The user is on the login page
    When The user enters Hasan's credentials
    Then The user should be able to see dashboard page
    When The user clicks on Developers link
    Then The user should be able to see developers page title


  Scenario: Developers Page Test - Cucumber Parameters
    Given The user is on the login page
    When The user logins with "hgezer@gmail.com" and "Hg12345678"
    Then The user should be able to see "Hasan Gezer" on dashboard page
    When The user clicks on tab: "JavaScript" and module: "Draggable"
    Then The user should be able to see related page title with three parts: "Draggable"
    When The user clicks on tab: "Developers" and module: ""
    Then The user should be able to see related page title with two parts: "Developers"

  Scenario: Dashboard Tabs Check
    Given The user is on the login page
    When The user logins with "hgezer@gmail.com" and "Hg12345678"
    Then The user should be able to see "Hasan Gezer" on dashboard page
    And The user should verify the dashboard tabs with follows
      | Dashboard   |
      | Developers61  |
      | Components  |
      | Forms       |
      | JavaScript  |
      | Hasan Gezer |

