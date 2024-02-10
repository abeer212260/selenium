package seleniumframework;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.opentest4j.IncompleteExecutionException;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsertest {
public static void main(String[] args) throws Exception {
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
 	 	 	//driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Malta International Airport");
 	 	 	//MaltaAirport=driver.findElement(By.xpath("//div[@id='site']/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]"));
 	 	 //	MaltaAirport.click();
 	
 	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
 	//WebElement results = driver.findElement(By.xpath("//div[@class='airport-option selected']"));
 			//results(0).click();
 	//driver.findElement(By.xpath("//a[text()='Vienna International']")).click();
 	//WebElement clickable =
 		//	driver.findElement(By.xpath("//label[contains(text(),'Departing from')]"));
 			//new Actions(driver)
 			  // .contextClick(clickable)
 			   //.perform();
 			//Alert alert = new WebDriverWait(driver,
 			  // Duration.ofSeconds(2))
 			   //.until(ExpectedConditions.alertIsPresent());
 			//Assertions.assertEquals("Vienna International (VIE)",
// 			alert.getText());


	
}

private static Actions results(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
