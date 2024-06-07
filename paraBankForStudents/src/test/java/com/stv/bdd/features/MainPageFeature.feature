Feature: FinalTest


  Scenario: 01. The Customer Look up Page is loaded
    Given The home page Parasoft Parabank
    When The user clicks Forgot Login info link
    Then The Customer Lookup Page is loaded


  Scenario: 02. Check there is an error with empty required fields
    Given The Customer Lookup Page
    When The user clicks on 'Find my login info' button
    Then The validation errors appear next to all required fields


  Scenario Outline: 03. Check the error page is loaded with not found user
    Given The Customer Lookup Page
    When The user clicks on 'Find my login info' button
    And The validation errors appear next to all required fields
    And The user enters data in firstname '<firstname>'
    And The User enters data in lastname '<lastname>'
    And The user enters data in address '<address>'
    And The user enters data in city '<city>'
    And The user enters data in state '<state>'
    And The user enters data in zipcode '<zipcode>'
    And The user enters data in SSN '<SSN>'
    And The user clicks Find my login info button
    Then The page error the user not found is loaded
    Examples:
    | firstname | lastname | address | city | state | zipcode | SSN |
    | anna      | qwerty   | ul.star | Minsk | Minsk | 220000 | 123456|

