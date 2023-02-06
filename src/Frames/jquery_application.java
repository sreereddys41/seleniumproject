package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jquery_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		By frameOfWebPagel=By.className("demo-frame");
		WebElement frameOfWebPage=driver.findElement(frameOfWebPagel);
		
		driver.switchTo().frame(frameOfWebPage);
		
		By dragMeToMyTargetL=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetL);
		
		String dragMeToMyTarget_Text=driver.findElement(dragMeToMyTargetL).getText();
		System.out.println("The Element Drag me to y Target is: "+dragMeToMyTarget_Text);
		
		By dropHereL=By.id("droppable");
		WebElement dropHere=driver.findElement(dropHereL);
		
		String dropHere_Text=driver.findElement(dropHereL).getText();
		System.out.println("dropHere_Text");
		
		Actions action=new Actions(driver);
		action.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
		
		driver.switchTo().defaultContent();
		
		By resizableL=By.linkText("Resizable");
		WebElement resizable=driver.findElement(resizableL);
		resizable.click();
		
		String resizableWebPageTitle=driver.getTitle();
		System.out.println(resizableWebPageTitle);

	}

}
