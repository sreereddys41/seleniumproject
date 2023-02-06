package Bingpage_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BIngpageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		
		String actual_Bingpageurl=driver.getTitle();
		System.out.println("Home page Title is:"+actual_Bingpageurl);
		
		String expected_Bingpageurl="B";
		System.out.println("Home page title is:"+expected_Bingpageurl);
		
		if(actual_Bingpageurl.startsWith(expected_Bingpageurl))
		{
			System.out.println("Matched-Pass");
		}
		else
		{
			System.out.println("Not matched-Fail");
		}
		
		driver.quit();

	}

}
