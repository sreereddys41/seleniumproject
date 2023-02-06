package TSRTC_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Linksvalidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
	
		
		By tsrtc_headerBlockL=By.className("menu-wrap");
		WebElement tsrtc_headerBlocks=driver.findElement(tsrtc_headerBlockL);
		
		By linksL=By.tagName("a");
		List<WebElement>tsrtc_headerBlocksLinks=tsrtc_headerBlocks.findElements(linksL);
		
		int tsrtcheaderBlocksLinks_Count=tsrtc_headerBlocksLinks.size();
		System.out.println("The no of links in the TSRTC header block links are "+tsrtcheaderBlocksLinks_Count);
		
		
		for(int index=0;index<tsrtcheaderBlocksLinks_Count;index++)
		{
		String tsrtcheaderBlocks_LinksName=tsrtc_headerBlocksLinks.get(index).getText();
		System.out.println(index+" "+tsrtcheaderBlocks_LinksName);
		
		tsrtc_headerBlocksLinks.get(index).click();
		
		String actual_WebPageTitle=driver.getTitle();
		System.out.println(actual_WebPageTitle);
		
		String actual_WebPageUrl=driver.getCurrentUrl();
		System.out.println(actual_WebPageUrl);
		
		System.out.println();
		driver.navigate().back();
		
		Thread.sleep(5000);
		tsrtc_headerBlockL=By.className("menu-wrap");
		tsrtc_headerBlocks=driver.findElement(tsrtc_headerBlockL);
		
		//Thread.sleep(5000);
		linksL=By.tagName("a");
		tsrtc_headerBlocksLinks=driver.findElements(linksL);
				
		}
		

	}

}
