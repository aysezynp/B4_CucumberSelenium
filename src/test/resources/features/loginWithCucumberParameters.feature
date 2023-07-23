Feature: Login tests with cucumber parameters
  #mike
  @mikeParameter @ParameterizeMethods
  Scenario: Login with Mike -Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    Then Validate that username is "mike"

    #John
  @johnParameter @ParameterizeMethods
  Scenario: Login with John - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    Then The user should be able to login
    Then Validate that username is "John"

    #Eddie Murphy
  @eddieParameter @ParameterizeMethods
  Scenario: Login with Eddie - Cucumber Parameters
    Given The user is on the login page
    When The user logs in using "eddiem@kraft.com" and "eddiem12"
    Then Validate that username is "Eddie Murphy"

