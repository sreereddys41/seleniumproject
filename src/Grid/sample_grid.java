package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample_grid {
	
	@Parameters("Browser")
	@Test
	public void logintest(String browserName) throws MalformedURLException
	{
		System.out.println(browserName);
		
		
		DesiredCapabilities cap=null;
		
		if(browserName.equals("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		else
	 		if(browserName.equals("edge"))
			{
				cap=DesiredCapabilities.edge();
				cap.setBrowserName("edge");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.42.79:4444/wd/hub"),cap);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	

}
