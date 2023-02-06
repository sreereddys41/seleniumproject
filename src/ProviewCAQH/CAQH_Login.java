package ProviewCAQH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAQH_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://proview.caqh.org/Login/Index?ReturnUrl=%2f");
		Thread.sleep(5000);
		driver.findElement(By.id("UserName")).sendKeys("prawin123");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div/div[5]/div/button")).click();
	}

}
