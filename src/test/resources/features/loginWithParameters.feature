Feature: Log in as different user
  #Agile Story : As a user, I should be able to log in as different user
  @wip
  Scenario: Log in as Teacher with parameters
    Given The user is on the log in page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"