package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("SuccessFully Launched Chrome Browser");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Open To OrangeHRM HomePage");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		By pIML = By.linkText("PIM");
		WebElement pIM = driver.findElement(pIML);
		
		Thread.sleep(4000);
		Actions action= new Actions(driver);
		action.moveToElement(pIM).build().perform();
		
		Thread.sleep(4000);
		pIM.click();
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		
		
		
		By addEmployeeL = By.linkText("Add Employee");
		WebElement addEmployee= driver.findElement(addEmployeeL);

		Actions action_AddEmployee = new Actions(driver);
		action.moveToElement(addEmployee).build().perform();

	}

}
 