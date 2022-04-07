package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectRepo {

	WebDriver driver;
	
	int pickupdate=calendar.get(Calendar.DAY_OF_MONTH);
	int dropoffdate=pickupdate+1;
	
	//Web page objects
	By GoogleSearch = By.xpath("//input[@id,'input']");
	By MauiWebSiteLink= By.xpath("//a[@href='https://www.maui-rentals.com/']");
	By MauiNewZealandImage=By.xpath("//img[@alt='Maui New Zealand']");
	By HireNZ=By.xpath("//div[@id="barba-wrapper"]//h1");
	By PickUpDateButton=By.xpath("//form[@id="form_main"]//button[contains(text(),'Pick Up Date')]");
	//By PickUpDate=By.xpath("//*[@id="datepicker__main"]/div/table/tbody/tr[2]/td[3]/a"); //Without Dynamic date value
	By PickUpDate=By.xpath("//*[@id="datepicker__main"]/div/table//a[(text()='"+pickupdate+"')]"); //With Dynamic date value
	By DropOffDateButton=By.xpath("//button[contains(text(),'Drop Off Date')]");
	//By DropOffDate=By.xpath("//*[@id="datepicker__main"]/div/table/tbody/tr[2]/td[4]/a"); //Without Dynamic date value
	By DropOffDate=By.xpath("//*[@id="datepicker__main"]/div/table/tbody//a[(text()='"+dropoffdate+"')]");  //With Dynamic date value
	//By PickUpLocation=By.xpath("//*[@id="form_main"]/div[5]/div/div/ul/li[contains(text(),'Auckland')]"); //Without Dynamic location value
	By PickUpLocation=By.xpath("//*[@id="form_main"]/div[5]/div/div/ul/li[(text()='"+pickuplocation+"')]");  //With Dynamic location value
	//By DropOffLocation=By.xpath("//*[@id="form_main"]/div[6]/div/div/ul/li[contains(text(),'Auckland')]"); //Without Dynamic location value
	By DropOffLocation=By.xpath("//*[@id="form_main"]/div[6]/div/div/ul/li[(text()='"+dropofflocation+"')]"); //With Dynamic location value
	By DriversLicence=By.xpath("//select[@id="form_licence__main"]/option[@value='NZ'][1]");
	By Searchbutton=By.xpath("//*[@id="form_main"]/button/span[contains(text(), 'Search')]");
	By ResultList=By.xpath("//*[@id="rootPrimary"]//div[3]/div/div[@class= 'row sub-section']");
	
	By BritzWebSiteLink= By.xpath("//a[@href='https://www.britz.com/']");
	By BritzNewZealandImage=By.xpath("//img[@alt='Britz New Zealand']");
		
	//Method to search in google
	public void typeSearchValue(String value){
        driver.findElement(GoogleSearch).sendKeys(value);
        
        WebDriverWait wait=new WebDriverWait(driver, 15);
        if (value=="Maui") 
        {
        	wait.until(ExpectedConditions.presenceOfElementLocated(MauiWebSiteLink));
        }
        else
        {
        	wait.until(ExpectedConditions.presenceOfElementLocated(BritzWebSiteLink));
        }
    }
	
	//Method to click on Maui web site link
	public void clickMauiWebSiteLink(){
        driver.findElement(MauiWebSiteLink).click;
        
        WebDriverWait wait=new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.presenceOfElementLocated(MauiNewZealandImage));
    }
	
	//Method to click on destination
	public void clickDestinationLink(String value){
        driver.findElement(NewZealandImage).click;
        
        WebDriverWait wait=new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.presenceOfElementLocated(HireNZ));
    }
	
	//Click on Pick up date button
	public void clickPickUpDate(){
        driver.findElement(PickUpDateButton).click;
    }
	
	//Select Pick up date
	public void selectPickUpDate(){
        driver.findElement(PickUpDate).click;
    }
	
	//Click on Drop off date button
	public void clickDropOffDate(){
        driver.findElement(DropOffDateButton).click;
    }
	
	//Select Drop off date
	public void selectDropOffDate(){
        driver.findElement(DropOffDate).click;
    }
	
	//Select pick up location
	public void selectPickUpLocation(String pickuplocation){
        driver.findElement(PickUpLocation).click;
    }
	
	//Select drop off location
	public void selectDropOffLocation(String dropofflocation){
        driver.findElement(DropOffLocation).click;
    }
	
	//Select Drivers Licence
	public void selectDriversLicence(String driverslicence){
        driver.findElement(DriversLicence).click;
    }
	
	//Click on search button
	public void clickSearchButton(){
        driver.findElement(Searchbutton).click;
    }
	
	//Check result row count
	public int checkResultCount(){
		int count =(driver.findElements(ResultList).size());
		return count;
    }
	
	//Method to click on Britz web site link
	public void clickBritzWebSiteLink(){
        driver.findElement(BritzWebSiteLink).click;
        
        WebDriverWait wait=new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.presenceOfElementLocated(BritzNewZealandImage));
    }
	
	public ObjectRepo(WebDriver driver) {
		this.driver=driver;
	}
}
