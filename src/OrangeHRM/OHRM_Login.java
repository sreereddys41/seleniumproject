package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_Login {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SSC\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		By linkL=By.linkText("Logout");
		WebElement Clicking=driver.findElement(linkL);
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		action.moveToElement(Clicking);
		
		String ClickingAttributeValue=Clicking.getAttribute("href");
		Clicking.click();
		
		/*
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		
		String emptext=driver.findElement(By.className("oxd-input oxd-input--active")).getText();
		System.out.println(emptext);
		
		/*
		By pimL=By.className("oxd-text oxd-text--span oxd-main-menu-item--name");
		WebElement PIM=driver.findElement(pimL);
		
		Actions action=new Actions(driver);
		action.moveToElement(PIM).build().perform();
		
		
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
		
	 	/*
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		By linkL=By.linkText("Logout");
		WebElement Clicking=driver.findElement(linkL);
		String ClickingAttributeValue=Clicking.getAttribute("class");
		Clicking.click();
		
		driver.findElement(By.className("oxd-userdropdown-name"));
		Thread.sleep(6000);
		driver.findElement(By.className("oxd-userdropdown-link"));
		
		*/
	}

}

