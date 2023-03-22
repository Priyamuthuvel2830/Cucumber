Feature: Checking the functionality of hotel booking
@SmokeTest
Scenario Outline: Checking the functionality of loginpage
Given lauch the url
When enter the "<username>" in the username feild
And enter the "<password>" in the password feild
Then checking the functionlity of login page its navigate to search hotel page 

Examples:
|username|password|
|abc|123|
|erti|4566|
|PRIYADHARSHINIRATHA|Radha1991|

@SanityTest
Scenario: Checking the functionality of Search Hotel Page
When user select the location
And user select the hotel name
And user select room type 
And user select no of rooms needed
And user select pickin date
And user select pickout date
And user select no of adult room needed
And user select no of child room needed
Then click the submit button its navigate to hotel select Page

When select the hotel which the user need
Then click continue button its navigate to hotel booking page

Scenario: Checking the functionality of Hotel Booking
When User enter the firstname
And user enter the lastname
And user enter the Address
And user enter the credit card number
And user Select the credit type
And user select the credit card exp month
And user select the credit card exp year
And user enter the credit card cvv for payment 
Then user choose book now for hotel booking