package oHRMapplication_Assignment;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	Logger log=Logger.getLogger("BaseTest");
	
	WebDriver driver;
	String applicationURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@BeforeTest
	public void Setup()
	{
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		log.info("Login Successful");
		
	}
	
	/*
	 @Test
	 
	public void tearDown()
	{
		driver.close();
		log.info("Closed Successfully");
	}
	
*/
}
