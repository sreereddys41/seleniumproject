package TSRTC_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class codefromsunil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				//LaunchBrowser
				WebDriver driver ;
				System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.tsrtconline.in/");
				//driver.manage().window().maximize();
				System.out.println("");

				// identifying the Header Block
				By tsrtc_HeaderBlockL = By.className("menu-wrap");
				WebElement tsrtc_HeaderBlock = driver.findElement(tsrtc_HeaderBlockL);
				By linksL = By.tagName("a");

				// Using the Identified Header Block - Working on the Elements In Header Block
				List<WebElement> tsrtc_HeaderBlock_Links = tsrtc_HeaderBlock.findElements(linksL);
				int  tsrtc_HeaderBlock_LinksCount = tsrtc_HeaderBlock_Links.size();
				System.out.println("Total Count of WebElements in HomePage Header Block : "+ ""+tsrtc_HeaderBlock_LinksCount);
				System.out.println();

				for(int i=0; i<tsrtc_HeaderBlock_Links.size(); i++)
				{
					String tsrtc_HeaderBlock_LinksName =tsrtc_HeaderBlock_Links.get(i).getText();
					System.out.println(i+ " "+tsrtc_HeaderBlock_LinksName);
					String expectedUrl  =driver.getCurrentUrl();
					System.out.println("Expected CurrentUrl Of "+tsrtc_HeaderBlock_LinksName+" "+ "Webpage"+ "---> "+expectedUrl);
					System.out.println();
					
					
				
				tsrtc_HeaderBlock_Links.get(i).click();
				
				System.out.println("sdfdsfsd");
				
				
				driver.navigate().back();
				}
			
	}
	
		}

