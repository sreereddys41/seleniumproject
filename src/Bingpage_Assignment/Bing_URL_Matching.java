package Bingpage_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_URL_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/SSC/Downloads/"
									+"chromedriver_win32 (1)/"
										+"chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		
		String x=driver.getCurrentUrl();
		System.out.println(x);
		
		String y="bing.com";
		System.out.println(y);
		
		if(x.contains(y))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
		driver.quit();

	}

}
