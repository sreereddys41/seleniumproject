package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		File bingcapturedscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingcapturedscreenshot, new File("./ApplicationScreenShot/bing.png"));
		
		

	}

}
