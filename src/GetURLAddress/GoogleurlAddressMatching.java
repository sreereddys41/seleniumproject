package GetURLAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleurlAddressMatching {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		String actual_GooglepageURL=driver.getCurrentUrl();
		System.out.println("Home page URL:"+actual_GooglepageURL);
		
		String expected_GooglepageURL="google.com";
		System.out.println("Home page URL:"+expected_GooglepageURL);
		
		if(actual_GooglepageURL.contains(expected_GooglepageURL))
		{
			System.out.println("Test URL Matched-PASS");
		}
		else
		{
			System.out.println("Test URL not Matched- FAIL");
		}
		
		driver.close();
	}

}
