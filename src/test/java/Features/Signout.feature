Feature:Facebook SignOut file test

  Background:
    Given User already in facebook account page
    When I click in Signout
  @san
  Scenario: user in facebook account page for signout
    Then user should be signout successfully
@Reg
  Scenario: user in facebook page for signout
    Then user click signout and not working