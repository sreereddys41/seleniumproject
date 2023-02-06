package OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange1{

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome Browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("SuccessFully Launched Chrome Browser");

		// Navigate To OHRM Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Open To OrangeHRM HomePage");
		Thread.sleep(2000);

		// Automated Filling  UserName and Password By Using Send Keys and  after click Operation on LogIn - By Using  Valid Data
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();		
		System.out.println("Successfully Filled User Credinals");


		      //Mouse Hover Operation On to the LogOut
		Thread.sleep(1500);
		By logOutL = By.linkText("Logout");
		WebElement logOut = driver.findElement(logOutL);

		Actions action_LogOut = new Actions(driver);
		action_LogOut.moveToElement(logOut).build().perform();

		  // To Click On LogOut  
		Thread.sleep(3500);
		logOut.click();
		System.out.println("Successfully Clicked On LogOut Operation");

		  // Application close
		Thread.sleep(2000);
		driver.close(); 
		 System.out.println("Close The Application");
	}
}


