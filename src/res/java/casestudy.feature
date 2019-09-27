Feature: casestudy file
Scenario: user registration
Given user must be in the signup page
When User enters the username "jagadeesh1"
And user enters the first name "Jagadeesh"
And user enters the lastname "Jackyyyyyy" 
And user enters the password "abcd1234" 
And user enters the confirmPssword "abcd1234"
And user selects the gender "Male"
And user enters the emailAddress "jaga@gmail.com"
And user enters the mobileno "6546198444"
And user enters the dob "12/09/1997"
And user enters the Address "chennai city"
And user selects the securityQuestion "What is your Birth Place?"
And User enters the Answers "chennai"
Then user land on the login page
 

  


