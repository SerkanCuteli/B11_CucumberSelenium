Feature: Data Driven Testing in Cucumber

  @ddf_test
  Scenario Outline: DDF Login Test
    Given The user is on the log in page
    When The user enters "<sheetName>" and row number <rowNumber>
    Then The user verifies that welcome message contains in excel "<sheetName>" <rowNumberForName>
    Examples:
      | sheetName | rowNumber | rowNumberForName |
      | Test Data | 0         | 0                |

