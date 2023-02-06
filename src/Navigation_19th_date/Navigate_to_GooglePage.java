package Navigation_19th_date;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_to_GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		
		WebElement SignInElement=driver.findElement(By.linkText("sign in"));
		
		String SignInElement_Text=SignInElement.getText();
		System.out.println("The text of the element sign in is" +SignInElement_Text);
		SignInElement.click();
		
		

	}

}
