package RentalSearch;

import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.ObjectRepo;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class BritzRentalSearch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ObjectRepo objectrepo= new ObjectRepo(driver);
		
	@Given("^user has navigate to google$") 
	public void user_has_navigate_to_google() throws Throwable
	{
		driver.get("https://www.google.com");
	}
	
	@Given("^user search and navigate to {arg} web site$")
	public void user_search_and_navigate_to_web_site(searchvalue) throws Throwable
	{
		//Search the web page and navigate to the web site
		objectrepo.typeSearchValue(searchvalue);
		objectrepo.clickBritzWebSiteLink();
	}
	
	@When("^user select {arg} as the detination$") 
	public void user_select_as_the_destination(destination) throws Throwable
	{
		 //Select destination
		objectrepo.clickDestinationLink(destination);
	}	
	
	
	@Then("^user select pick up date, drop off date, {arg} as the pick up location,{arg} as the drop off location, {arg} as the drivers licence$")
	public void user_select_pickupdate_dropoffdate_pickuplocation_dropofflocation_driverslicence (pickuplocation, dropofflocation, driverslicence) throws Throwable
	{
		//Enter Pick up date, drop off date, pick up location, drop off location and drivers licence
		objectrepo.clickPickUpDate();
		objectrepo.selectPickUpDate();
		objectrepo.clickDropOffDate();
		objectrepo.selectDropOffDate();
		objectrepo.selectPickUpLocation(pickuplocation);
		objectrepo.selectDropOffLocation(dropofflocation);
		objectrepo.selectDriversLicence(driverslicence);
	}
	
	@And("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable
	{
		//Click on search
		objectrepo.clickSearchButton();	
	}
	
	
	@And("^user is able to see {arg} options$")
	public void user_is_able_to_see_options (results) throws Throwable
	{
		//Check the result count matches the expected value
		count=objectrepo.checkResultCount();
		assertEquals(results, count);
	}
	
	driver.close();

	}
}
