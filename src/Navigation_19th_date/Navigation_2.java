package Navigation_19th_date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		/*String signInElementText=driver.findElement(By.linkText("signin")).getText();
		
		System.out.println(signInElementText);
		*/
		WebElement signInElement=driver.findElement(By.linkText("signin"));
		String signInElementText=signInElement.getText();
		System.out.println(signInElementText);
		
		//getting the text of signin element
		 By signInLocator=By.linkText("signin");
		 WebElement signin=driver.findElement(signInLocator);
		 String signin_Text=signin.getText();
		 System.out.println("The text of the element signin is "+signin_Text);
		 
		 signin.click();
		 driver.quit();
		

	}

}
