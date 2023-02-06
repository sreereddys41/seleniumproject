package HomepageTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class googlePageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		
		//ChromeDriver driver1=new ChromeDriver();
		//driver1.get("http:bing.com");
		driver.quit();
	

	}

}
