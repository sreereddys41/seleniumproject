package Osmania_Portal;

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
import org.openqa.selenium.support.ui.Select;

public class osmania_lang {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.osmania.ac.in/");
		
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		By lang_Selection=By.id("gtranslate_selector");
		WebElement lang_Dropdown=driver.findElement(lang_Selection);
				
		
		By linkL=By.tagName("option");
		List<WebElement>osmaniaLink=driver.findElements(linkL);
		
		int osmaniaLink_Count=osmaniaLink.size();
		System.out.println(osmaniaLink_Count);
		
				
		for(int i=0;i<osmaniaLink_Count;i++)
		{
			
			String osmaniaLink_Name=osmaniaLink.get(i).getText();
			System.out.println(osmaniaLink_Name);
		}
		
		for(int i=0;i<osmaniaLink_Count;i++)
		{
		Select language=new Select(lang_Dropdown);
		language.selectByIndex(i);
		
		Thread.sleep(2000);
		
		File osmaniaScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(osmaniaScreenShot,new File("./ApplicationScreenShot/osmania"+i+".png"));
		
		Thread.sleep(3000);
			
		
		}
	}
}


