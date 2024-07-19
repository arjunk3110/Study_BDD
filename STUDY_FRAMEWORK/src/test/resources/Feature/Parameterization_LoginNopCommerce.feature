Feature: Login for NopCommerce Website using parameterization

  Scenario Outline: Login with valid credentials for NopCommerce Website using parameterization
    Given User navigated to URL
  When User Enters Valid "<username>" and "<password>"
    And User clicks on the login button
    Then User navigates to the home page and verify

    Examples: 
      | username             | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com  | admin   |
   
   
