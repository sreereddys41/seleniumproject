package SelectClass_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		driver.manage().window().maximize();
		
		
		
		By currentlocationL=By.className("multiselect__select modal-ref-class");
		WebElement currentlocation=driver.findElement(currentlocationL);
		
		Select currentexpselection=new Select(currentlocation);
		currentexpselection.selectByIndex(2);
		
	}

}
