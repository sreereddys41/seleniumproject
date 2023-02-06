package rediffmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class rediff_Signup {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.edge.driver","./browserdriverfiles/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Srikanth Reddy");
	
	driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("12345667");

}
}