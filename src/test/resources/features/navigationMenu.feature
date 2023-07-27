@regression
@navigation
Feature: Navigation Menu Tests
 @mike
  Scenario: Navigation to developers menu
    Given The user is on the login page
    When Login as Mike
    Then Validate that Dashboard text is visible
    When Go to developers menu
    Then Validate that Developers text is visible

  @sebastian @smoke
  Scenario: Navigation to Forms/Input menu
    Given The user is on the login page
    When Login as Sebastian
    Then Validate that Dashboard text is visible
    When Go to forms-input menu
    And Validate that General Form Elements - Input text is visible

  @john
  Scenario: Navigation to My Profile  menu
    Given The user is on the login page
    When Login as John
    Then Validate that Dashboard text is visible
    When Go to my profile menu
    And Validate that User Profile text is visible


