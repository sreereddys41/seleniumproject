package echo_RadioButtons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	

	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	/*
	@AfterTest
	public void TearDown()
	{
		driver.quit();
	}
*/
}
