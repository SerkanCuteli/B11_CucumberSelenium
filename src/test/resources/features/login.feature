Feature: DevEx log in test
  #Agile Story: As a user, I should be able to log in, so that I can see my dashboard.

  Scenario: Log in as a teacher
    Given The user is on the log in page
    When The user enters teacher credentials
    Then The user should be able to login

  Scenario: Log ins as student
    Given  The user is on the log in page
    When The user enters student credentials
    Then The user should be able to login

  Scenario: Log ins as developer
    Given  The user is on the log in page
    When The user enters developer credentials
    Then The user should be able to login



