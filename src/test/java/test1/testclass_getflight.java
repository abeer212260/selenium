package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testclass_getflight {
public static void main(String[]args) {
	getflightoptions();

	}

	public static void getflightoptions()  
	{
	 	WebDriver driver = new ChromeDriver();
	 	driver.get("https://airmalta.com/");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	
	WebElement DepartingFrom = driver.findElement(By.xpath("//div[@class='form-control d-inline-flex']"));
	DepartingFrom.click();
	 	driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Vienna International");
	 	WebElement ViennaAirport = driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
	 	ViennaAirport.click();
	 	
	 	WebElement FlyingTo = driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
	 	FlyingTo.click();
	 	 	driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Malta International Airport");
	 	 	WebElement MaltaAirport=driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
	 	 	MaltaAirport.click();
	 	 	
	 	 	WebElement departureDate1 = driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
	 	 	departureDate1.click();		 	 	

	 	 	
	        WebElement datePickerFROM = driver.findElement(By.xpath("//div[@id='flight-search-widget']/div/div/form/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]"));
	       List<WebElement> availableDates = datePickerFROM.findElements(By.tagName("td"));
	        String desiredDate = "11";
	        for (WebElement date : availableDates) {
	         if (date.getText().equals(desiredDate)) {
	              date.click();
	              break;

	        }}
	         
	         WebElement datePickerTO = driver.findElement(By.xpath("//div[@id='flight-search-widget']/div/div/form/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[3]/div[5]/div[6]/div"));
		       List<WebElement> availableDatesTO = datePickerTO.findElements(By.tagName("td"));
		        String desiredDateTO = "28";
		        for (WebElement dateTO : availableDatesTO) {
		         if (dateTO.getText().equals(desiredDate)) {
		              dateTO.click();
		              break;

		         }
}}}