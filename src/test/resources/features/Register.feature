Feature: Registration functionality

  Scenario: creating an account with mandatory fields
    Given user navigates to rister account page
    When user enters below deatails
    
    |firstName|jay|
    |lastName |kothari|
    |email|jayKothari@gmail.com|
    |telephone|3325647899|
    |password|9876|
    And user selects privacy policy checkbox
    And user clicks on continue button
    Then User account should be created


  Scenario: creating an account by entering all the details
    Given user navigates to rister account page
    When user enters below deatails
    
    |firstName|jay|
    |lastName |kothari|
    |email|jayKothari01@gmail.com|
    |telephone|3325647899|
    |password|9876|
    And user selects new for Newsletter
    And user selects privacy policy checkbox
    And user clicks on continue button
    Then User account should be created



