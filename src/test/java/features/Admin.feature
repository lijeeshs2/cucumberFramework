Feature: Admin page scenarios

  Scenario: Verify user details
    Given user is on the login page
    When the user tries to login the application with "Admin" and "admin123"
    And user navigate to the admin page
    And user searches for a user with "Admin"
    Then user should see the details of the user


