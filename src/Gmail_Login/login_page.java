package Gmail_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./browserdriverfiles/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("sriireddys@gmail.com");
		
		Thread.sleep(3000);
		//WebElement a=driver.findElement(By.className("VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b"));
		//a.click();
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}

}
