Feature: Rentals search in Maui
	As a user who needs to travel in New Zealand
	I want to search the rental options in Maui web site
	So that I can plan the travel dates

Acceptance Criteria
   - I will navigate to google
   - I will search rentals in Maui web site
   - I will provide destination, dates, pick up and drop off locations and driving license details
   - I will check the options given to me in Maui web site
   
Background: 
	Given user has navigate to google
	
Scenario: Search Maui rentals

Given user search and navigate to "Maui" web site
When user select "New Zealand" as the destination
Then user select pick up date, drop off date, "Auckland" as the pick up location, "Auckland" as the drop off location, "New Zealand" as the drivers licence
And user clicks on search button
And user is able to see "3" options