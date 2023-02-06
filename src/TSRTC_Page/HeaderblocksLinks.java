package TSRTC_Page;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderblocksLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		By tSRTC_headerBlockL=By.className("menu-wrap");
		WebElement tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
		
		By linksL=By.tagName("a");
		List<WebElement>tSRTC_HeaderBlockLinks=tSRTC_headerBlock.findElements(linksL);
		
		int tSRTC_headerBlockLinks_Count=tSRTC_HeaderBlockLinks.size();
		System.out.println("The no of links inth TSRTC Header Block are: "+tSRTC_headerBlockLinks_Count);
		
		for(int index=0;index<tSRTC_headerBlockLinks_Count;index++)
		{
			String tSRTC_headerBlock_LinkName=tSRTC_HeaderBlockLinks.get(index).getText();
			System.out.println(index+" "+tSRTC_headerBlock_LinkName);
			
			System.out.println();
			//driver.navigate().back();
			
			Thread.sleep(2000);
			tSRTC_headerBlockL=By.className("menu-wrap");
			tSRTC_headerBlock=driver.findElement(tSRTC_headerBlockL);
			
			Thread.sleep(2000);
			linksL=By.tagName("a");
			tSRTC_HeaderBlockLinks=driver.findElements(linksL);
			
			File tsrtcscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(tsrtcscreenshot, new File("./TSRTC ScreenShots/"+tSRTC_headerBlock_LinkName+".png"));

		}
		

	}

}
