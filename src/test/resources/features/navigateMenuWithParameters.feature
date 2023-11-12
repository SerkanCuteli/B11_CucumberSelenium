Feature: Navigate to Menu with Parameters
  @wip
  Scenario: Teacher navigates to All Posts Menu
    Given The user is on the log in page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    When The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"
