package validateHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Title_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		String actual_GooglepageTitle=driver.getTitle();
		System.out.println("Home Page title is :"+actual_GooglepageTitle);
		
		String expected_GooglepageTitle="Google";
		System.out.println("Home page title is:"+expected_GooglepageTitle);
		
		if(actual_GooglepageTitle.equals(expected_GooglepageTitle))
		{
			System.out.println("Title Matched-Pass");
		}
		else
		{
			System.out.println("Title not Matched- Fail");
		}
		
		driver.close();

	}

}
