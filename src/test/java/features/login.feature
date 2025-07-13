Feature: login validation

  Scenario: Verify valid credentials
    Given user is on the login page
    When the user tries to login the application with "Admin" and "admin123"
    Then the user should successfully login to the application

  Scenario: Verify Invalid credentials
    Given user is on the login page
    When the user tries to login the application with "Admin" and "admin234"
    Then the user should successfully login to the application