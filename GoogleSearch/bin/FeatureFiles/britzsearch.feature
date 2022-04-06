Feature: Rentals search in Britz
	As a user who needs to travel in New Zealand
	I want to search the rental options in Britz web site
	So that I can plan the travel dates

Acceptance Criteria
   - I will navigate to google
   - I will search rentals in Britz web site
   - I will provide destination, dates, pick up and drop off locations and driving license details
   - I will check the options given to me in Britz web site
   
Background: 
	Given user has navigate to google
	
Scenario: Search Britz rentals

Given user search and navigate to "Britz" web site
When user select "New Zealand" as the destination
Then user select pick up date, drop off date, "Auckland" as the pick up location, "Auckland" as the drop off location, "New Zealand" as the drivers licence
And user clicks on search button
And user is able to see "3" options