@parallelExecution
Feature: Negative Login Test


  #ClassTask--> Create a Negative Login Test Feature file with Scenario Outline which includes 4 different data as;
  # eurotech
  # eurotech@
  # eurotech@gmail
  # eurotec@gmail.com
  # Do not forget to take the messages which show the result as negative
  # Create Step Def class and if needed create locators and methods in related page class



  Scenario Outline: Negative login test
    Given The user is on the log in page
    When The user logs in using "<userType>" and "<password>"
    Then The user should be able to see message as '<message>'
    Examples:
      | userType          | password   | message                                                                                        |
      | eurotech@         | Test12345! | Gib etwas nach dem @-Zeichen ein. Die Angabe „eurotech@“ ist unvollständig.                    |
      | eurotech          | Test12345! | Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "eurotech" fehlt ein @-Zeichen. |
      | eurotech@gmail    | Test12345! | Please include a valid email!                                                                  |
      | eurotec@gmail.com | Test12345! | Invalid Credentials!                                                                           |
