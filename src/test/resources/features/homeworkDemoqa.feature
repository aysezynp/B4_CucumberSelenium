# Class Task f2 HW
# go to web page -> https://demoqa.com/
# verify that user see following menu list elements, forms,...

Feature: Home Page Menu Checks

  @demoqa_1
  Scenario: Example 1
    Given The user is on the home page
    Then Validate that the user should be able to see following menu

      | Elements                |
      | Forms                   |
      | Alerts, Frame & Windows |
      | Widgets                 |
      | Interactions            |
      | Book Store Application  |
