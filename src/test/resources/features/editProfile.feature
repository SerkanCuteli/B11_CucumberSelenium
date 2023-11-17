Feature: The user should be able to edit profile information

  Background:
    Given The user is on the log in page

    @wip
    Scenario: edit profile
      When The user logs in using "eurotech@gmail.com" and "Test12345!"
      And The user navigates to "Edit Profile" menu
      And The user select status "Manager"
      And The user slides the slader 5
      And The user add "company" "AWS Amazon"
      And The user add "website" "https://aws.amazon.com/"
      And The user add "location" "Washington"
      And The user add "skills" "Java,JS,React,Selenium"
      And The user add "githubusername" "teacherb11"
      And The user add "bio" "I want to be QA automation tester"
      And The user clicks on the submit button




