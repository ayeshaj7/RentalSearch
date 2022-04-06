# Rental Search

Project Title – Validate the Rental Search output

Description – The purpose of this project is to validate the rental search output and confirm the output meets the acceptance criteria.

Prerequisites

- Eclipse – Script Editor that can be download (the latest version) from internet.
- Cucumber plugins – Add as an external jar files to project so that BDD feature files and step definitions can be build. This can be downloaded from internet (the latest version).
- Selenium plugins – Add as a external jar files to integrate with cucumber. This can be downloaded from internet (the latest version).

Installing

- Install latest Eclipse version.
- Add cucumber pluigns as an external jars to build path.
- Add selenium plugins.

Running the tests – Execute the BritzRentalSearch.java and MauiRentalSearch.java test cases in Eclipse in order to validate the test results of the test cases. 

This test case is verifying whether below acceptance criteria is met.

Acceptance Criteria for Maui web site
   - I will navigate to google
   - I will search rentals in Maui web site
   - I will provide destination, dates, pick up and drop off locations and driving license details
   - I will check the options given to me in Maui web site
   
Acceptance Criteria for Britz website
   - I will navigate to google
   - I will search rentals in Britz web site
   - I will provide destination, dates, pick up and drop off locations and driving license details
   - I will check the options given to me in Britz web site
   
Step 1 – Created feature file mauisearch.feature to provide the BDD steps with cucumber. This will explain the steps that an end user will perform that meets the acceptance criteria.

Step 2 - Created step definition class MauiRentalSearch.java with the step skelyton for each step defined in the feature file. Further, the selenium web driver is set up as the first thing in the script and google is launched to perform the rental search.

Step 3 - Created the object repository ObjectRepo.java to keep all the web elements identifed within the web pages and the expected methods for each web element.

Step 4 - Updated MauiRentalSearch.java skelyton to call the methods related the the web elements and include the assertion to check the return result record count as per the selection ctrieria.

Step 5 - Repeat above step 1 to 4 for Britz web site. The web elements for Britz web site and Maui have similar Xpaths hence the objects and methods were reused for Britz web site in the same object repository. (Except the 2 hyperlinks for Britz website.)

Special notes:
1. The user inputs are parametrized in the feature file so that those can be pass to methods to perform actions.
2. The pick up date and drop off date is taken from the system date rather than hard coding the values. So this script can execute any day (As per the web site, past dates are becoming disable to select hence better to select the first enable date which is the system date). The dynamic xpaths are set to these 2 web elements so that it will pick up the system date for pick up date and system date+1 for drop off date.
3. The pick up and drop off location is taken from the user input. Hence the dynamic xpaths are set to those 2 web elements to use the user inputs.
4. Due to my machine state, I was unable to run the code and debug to validate any scripting errors. It'll be good to set this up in a machine with better resources and execute to fix any scripting errors.
5. Further improvments to this solution are listed below,
   - Remove the hard corded expected row count (3) passed from the feature file. Depend on the date selection there could be many rows return to UI possibley with pagination. Better keep some mock test data so that row count can be validated more efficiently by cross checking with DB records. 
   - Further enhance to validate the number of row counts with pagination.
   - Have private methods for web elements so that those methods can be called in more secure manner.
   - This git repository is not set up to integrate with CI/CD pipeline. This can be enahnce to integrate with a CI/CD piepline and get the deployment pipeline kick off once the pull request approvals are in place. Further, merge to master branch from the feature branch can be done once the deployment is successful. So that this set up can be used with better version controlling when the repository is used/ updated by many users.

Author – Ayesha Jayawardena
