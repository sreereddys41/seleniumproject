package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		By helloSignInL=By.id("nav-link-accountList-nav-line-1");
		WebElement hellosignin=driver.findElement(helloSignInL);
		
		Actions action=new Actions(driver);
		action.moveToElement(hellosignin).build().perform();
		
		By yourordersL=By.linkText("Your Account");
		WebElement yourorders=driver.findElement(yourordersL);
		yourorders.click();

	}

}
