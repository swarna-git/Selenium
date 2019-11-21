Feature: Login into the application 
Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" url
And click on Login link on Home page to land on SIgn in Page
When user enters <username> and <password> and logs in
Then Verify the user is successfully logged in 
And Close browser
Examples:
|username |password|
|swarna@gmail.com|addy1234|
|swar@yahoo.com|addy123|