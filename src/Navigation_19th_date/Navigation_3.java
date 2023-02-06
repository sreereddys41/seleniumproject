package Navigation_19th_date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		By signinL=By.linkText("signin");
		WebElement signin=driver.findElement(signinL);
		
		//String SignInAttributeValue=signin.getAttribute("href");
		String SignInAttributeValue=signin.getAttribute("class");
		System.out.println("The attribute of signin Element is "+SignInAttributeValue);
		String signin_Text=signin.getText();
		
		
	}

}
