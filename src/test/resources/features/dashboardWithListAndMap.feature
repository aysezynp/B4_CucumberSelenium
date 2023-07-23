Feature: Dashboard Menu Checks
Background:
  Given The user is on the login page

  @c_list
  Scenario: Example-1 for Cucumber List
   # Given The user is on the login page
    When The user logs in using "jennifer@gmail.com" and "Jenni1234"
    Then The user should be able to login
    And The user should be able to see following menu
    |Dashboard|
    |Developers|
    |Components|
    |Forms|
    |JavaScript|
    |jennifer|

 @c_Map
 Scenario: Example 2- for Cucumber Map
  # Given The user is on the login page
   When The user logs in using following menu
   |username|jennifer@gmail.com|
   |password|Jenni1234         |
   |name|jennifer              |
   Then The user should be able to login
   And The user should be able to see following menu
    |Dashboard|
    |Developers|
    |Components|
    |Forms|
    |JavaScript|
    |jennifer|

# # Class Task
#    # go to web page
#    # login with user credentials
#    # navigates to my Profile menu
#    # see following menu Overview,Edit Profile,Add Experience,Add Education,Change Password


  @c_task_f1
   Scenario: Example 3 for Task
    # Given The user is on the login page
     When The user logs in using "jennifer@gmail.com" and "Jenni1234"
     And The user navigates to "jennifer" and "My Profile" submenu
     Then The user should be able to see following submenu
       |Overview|
       |Edit Profile|
       |Add Experience|
       |Add Education|
       |Change Password|


