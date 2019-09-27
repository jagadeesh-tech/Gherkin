Feature:lofin file
Scenario Outline: login
    Given  the login page
    When username "<username>"
    And  password"<password>"
    Then home page

    Examples: 
      |username|password|
      |lalitha|password123|
