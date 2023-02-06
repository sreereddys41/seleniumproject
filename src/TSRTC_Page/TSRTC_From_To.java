package TSRTC_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_From_To {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		WebElement m=driver.findElement(By.id("fromPlaceName"));
		m.sendKeys("Hyderabad",Keys.ENTER);
		//m.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		m=driver.findElement(By.id("toPlaceName"));
		m.sendKeys("Vijayawada",Keys.ENTER);
		//m.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		

	}

}
 