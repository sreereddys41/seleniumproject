package OrangeHRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OHRM_Excel_login {

	
	//public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	@Test
	
		public void login() throws IOException, InterruptedException
		{

		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("./Excel_path/Multiple_Testdata.xlsx");

		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("sheet3");

		int rowCount=sheet.getLastRowNum();

		for(int rowIndex=0;rowIndex<=rowCount;rowIndex++)
		{

			Row row=sheet.getRow(rowIndex);

			Cell userNameRowOfCell=row.getCell(0);

			String userNameTestData=userNameRowOfCell.getStringCellValue();
			System.out.println(userNameTestData);

			Cell passwordRowOfCell=row.getCell(1);

			String passwordTestData=passwordRowOfCell.getStringCellValue();
			System.out.println(passwordTestData);

			By userNameL=By.name("username");
			WebElement userName=driver.findElement(userNameL);
			userName.sendKeys(userNameTestData);

			By passwordL=By.name("password");
			WebElement password=driver.findElement(passwordL);
			password.sendKeys(passwordTestData); 

			By loginButtonL=By.tagName("button");
			WebElement button=driver.findElement(loginButtonL);
			button.click();

			String ExpectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

			String ActualUrl=driver.getCurrentUrl();

			if(ActualUrl.equals(ExpectedUrl))
			{
				System.out.println("pass");
				Cell rowOfNewCell=row.createCell(2);
				rowOfNewCell.setCellValue("Orange HRM Home page Text Found-Pass");
			}				
			else

			{
				System.out.println("Fail");
				Cell rowOfNewCell=row.createCell(2);
				rowOfNewCell.setCellValue("Orange HRM Home page Text not Found-Fail");

				File capturedScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(capturedScreenShot,new File("./Excel_path/screenshot"+rowOfNewCell+".png"));
			}

			//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
			//Thread.sleep(8000);

			FileOutputStream file1=new FileOutputStream("./Excel_path/Multiple_Testdata.xlsx");
			workBook.write(file1);

		
		
		driver.switchTo().alert();
		By.className("oxd-dropdown-menu");
		By logoutL=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutL);
		Thread.sleep(5000);
		logout.click();
		} 
	}
}
