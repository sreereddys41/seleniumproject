package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class orange_HRM {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		// Launch Chrome Browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./browsedriverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("SuccessFully Launched Chrome Browser");

		// Navigate To OHRM Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Open To OrangeHRM HomePage");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		// Automated Filling  UserName and Password By Using Send Keys and  after click Operation on LogIn - By Using  Valid Data
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();		
		System.out.println("Successfully Filled User Credinals");

/*
		//Mouse Hover Operation On to PIM 
		//Thread.sleep(4500);
		By pIML = By.linkText("PIM");
		WebElement pIM = driver.findElement(pIML);

		  Create An Object On Action Class For  Mouse Hover To PIM  

		Actions action= new Actions(driver);
		action.moveToElement(pIM).build().perform();

		// To Click On PIM

		pIM.click();
		System.out.println(" Successfully Click Operation Done On PIM ");

		//Mouse Hover Operation On to Add Employee

		By addEmployeeL = By.linkText("Add Employee");
		WebElement addEmployee= driver.findElement(addEmployeeL);

		Actions action_AddEmployee = new Actions(driver);
		action.moveToElement(addEmployee).build().perform();

		//To Click On Add Employee
		//Thread.sleep(5000);
		addEmployee.click();
		System.out.println(" Successfully Click Operation Done On Add Employee ");
*/
		/*

				 // Automated To Fill Add Employee Details By Using Send Keys

				driver.findElement(By.name("firstName")).sendKeys("Ravula");
				driver.findElement(By.name("middleName")).sendKeys("SunilKumar");
				driver.findElement(By.name("lastName")).sendKeys("Reddy");
				//driver.findElement(By.xpath("//input[@class ='oxd-input oxd-input--active']"));
				System.out.println("Successfully Filled new Add Employee Details");


		                 //Mouse Hover Operation On to Save

				By saveL =By.tagName("button");
				WebElement save= driver.findElement(saveL);

				Actions action_Save = new Actions(driver);
				action.moveToElement(save).build().perform();


				// To Click On Save Button

				save.click();
				System.out.println("Successfully Clicked On Save Button");

				By emp_IdL = By.cssSelector("oxd-input.xd-input--active");
				//By emp_IdL = By.xpath("//*[@class='oxd-input oxd-input--active]");
				WebElement empId= driver.findElement(emp_IdL);


				Actions action_EmpId = new Actions(driver);
				action.moveToElement(empId).build().perform();
				driver.switchTo().defaultContent();

				By emp_IdL = By.className("oxd-input oxd-input--focus");
				WebElement  emp_Id = driver.findElement(emp_IdL);
				String empp_Id = empId.getAttribute("class");
				String emp_ID = empId.getAttribute("class");
				System.out.println("To Print The Employee Id :" +empId);


		        //To Find The Text Of An Employee Id(Print Employee Id)

				By empIdL = By.className("oxd-input oxd-input--active");
				WebElement  empId = driver.findElement(empIdL);
				String emp_Id = empId.getAttribute("class");
				String emp_ID = empId.getText();
				System.out.println("To Print The Employee Id :" +emp_ID);  */

		//Mouse Hover Operation On to Profile Person Name
		/*			
				By profilePersonNameL = By.tagName("p");
				WebElement  profilePersonName = driver.findElement(profilePersonNameL);

				Actions action_ProfilePageName = new Actions(driver);
				action.moveToElement(profilePersonName).build().perform();

				//To Click On Profile Name
				Thread.sleep(2500);
				profilePersonName.click();
				System.out.println("Successfully Clicked On ProfilePage Name");
		 

		//Mouse Hover Operation On to the LogOut

		By logOutL = By.linkText("Logout");
		WebElement logOut = driver.findElement(logOutL);

		Actions action_LogOut = new Actions(driver);
		action.moveToElement(logOut).build().perform();

		// To Click On LogOut

		logOut.click();
		System.out.println("Successfully Clicked On LogOut Operation");

		// Application close

		driver.close(); 
		System.out.println("Close The Application");
*/
	}

}



