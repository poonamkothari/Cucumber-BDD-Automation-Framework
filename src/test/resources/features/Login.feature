

Feature: Login functionality


  Scenario: Login with valid credentials
    Given user has navigated to login page
    When user enters valid email "poonam.kothari@gmail.com" into email field
    And user enters valid password "1357" into password field
    And user clicks on login button
    Then user should be logged in successfully

 Scenario: Login with invalid credentials
    Given user has navigated to login page
    When user enters invalid email into email field
    And user enters invalid password "123456" into password field
    And user clicks on login button
    Then user should get a warning message
    
     Scenario: Login with valid Email and invalid password
    Given user has navigated to login page
    When user enters valid email "poonam.kothari@gmail.com" into email field
    And user enters invalid password "123456" into password field
    And user clicks on login button
    Then user should get a warning message
    
    Scenario: Login with invalid email and valid password
    Given user has navigated to login page
    When user enters invalid email into email field
    And user enters valid password "1357" into password field
    And user clicks on login button
    Then user should get a warning message
    
    Scenario: Login without providing any credentials
    Given user has navigated to login page
    When user dont ener email into email field
    And user dont enter password into password field
    And user clicks on login button
    Then user should get a warning message
    