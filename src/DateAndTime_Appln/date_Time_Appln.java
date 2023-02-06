package DateAndTime_Appln;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class date_Time_Appln {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		date_Time_Appln dta=new date_Time_Appln();
		dta.setup();
		Thread.sleep(2000);
		dta.worldclock();
		

	}
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"site-nav\"]/li[2]/a")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void TearDown()
	{
		driver.close();
	}
	
	public void bhanu()
	{
		By cityNameL=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		WebElement cityName=driver.findElement(cityNameL);
		String Names=cityName.getText();
		System.out.println(Names);
				
		}
		
	
	public void worldclock() throws InterruptedException, IOException
	{
	
		By linksL=By.tagName("a");
		List<WebElement> links=driver.findElements(linksL);
		int nooflinks=links.size();
		System.out.println(nooflinks);
		
		for(int i=1;i<36;i++)
		{
			for (int j=1;j<8;j++)
			{
		By cityNameL=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]");
		WebElement cityName=driver.findElement(cityNameL);
		String Names=cityName.getText();
		System.out.print(Names);
				
		}
		System.out.println();
	}
	}

}

