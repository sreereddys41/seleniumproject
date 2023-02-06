package TSRTC_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Links_Finding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		By homeL=By.linkText("Home");
		WebElement home=driver.findElement(homeL);
		String home_Text=home.getText();
		System.out.println(home_Text);
		
		By linkL=By.tagName("a");
		List<WebElement>TSRTC_HomePageLinks=driver.findElements(linkL);
		
		int TSRTC_HomePageLinks_Count=TSRTC_HomePageLinks.size();
		System.out.println("The number of links in Home Page are "+TSRTC_HomePageLinks_Count);
		
		for(int i=0;i<TSRTC_HomePageLinks.size();i++)
		{
			String TSRTC_HomePageLinkName=TSRTC_HomePageLinks.get(i).getText();
			System.out.println(i+" "+TSRTC_HomePageLinkName);
		}
		
		//driver.quit();
		
	}

}
