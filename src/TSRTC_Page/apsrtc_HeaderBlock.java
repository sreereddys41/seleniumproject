package TSRTC_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class apsrtc_HeaderBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		By header_linksL=By.className("menu-wrap");
		WebElement headerlink=driver.findElement(header_linksL);
		
		By linksL=By.tagName("a");
		List<WebElement>headerlink_count=headerlink.findElements(linksL);
		
		int apsrtc_headerlink_count=headerlink_count.size();
		System.out.println(apsrtc_headerlink_count);
		
		for(int index=0;index<apsrtc_headerlink_count;index++)
		{
			String apsrtcheaderblock_name=headerlink_count.get(index).getText();
			System.out.println(apsrtcheaderblock_name);
			
			headerlink_count.get(index).click();
			
			
			header_linksL=By.className("menu-wrap");
			headerlink=driver.findElement(header_linksL);
			
			linksL=By.tagName("a");
			headerlink_count=driver.findElements(linksL);
			
			
		}

	}

}
