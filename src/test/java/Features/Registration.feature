Feature:Registration file test

  Background:
    Given User already in landing page

  @Reg
  Scenario: create an account for registration
    When I enter valid information
    Then user should be submite all information successfully

  @e2e
  Scenario: wrong information in registration form
    When I enter invalid information
    Then user should not be submite all information successfully

@e2e
  Scenario: Correct name and wrong date of birth in the registration
    When I enter Correct name and wrong date of birth in the registration form
    Then user would be submite all information not successfully

  @Reg
  Scenario: wrong gender submite in the registration form
    When I enter wrong gender
    Then user submite wrong gender not successfully

@san
  Scenario: without information submite registration form
    When I enter blank information
    Then user submite without information not successfully

