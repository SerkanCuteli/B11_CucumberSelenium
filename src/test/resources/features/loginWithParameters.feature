@loginWithParameter @smoke
Feature: Log in as different user
  #Agile Story : As a user, I should be able to log in as different user

  Scenario: Log in as Teacher with parameters
    Given The user is on the log in page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome message contains "Teacher"

  @parallelExecution
  Scenario: Log in as Student with parameters
    Given The user is on the log in page
    When The user logs in using "sdetb11@eurotech.study" and "Test1234"
    Then The user should be able to login
    And The welcome message contains "sdetb11"

    #HOMEWORK
  #Crate a new feature file named navigateMenuWithParameters.feature

  # Login as s teacher
  # verify welcome message
  # go to Past page
  # verify "Post"

