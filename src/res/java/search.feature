Feature: search file

  Scenario: successful search
  Given user must be in the login page
  When enter the search word "Head"
  Then the product is found and purchased
  Scenario: unsuccessful search
  Given  user must be in the login page
  When enter the search word "class" 
  Then the product is not found
  
 