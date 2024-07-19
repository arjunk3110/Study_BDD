Feature: Google Search Feature

  Scenario: Validate google search is working
  
    Given User navigated to Google.com
    When User search text on searchbox
    And User click enter
    Then Search Result Found
