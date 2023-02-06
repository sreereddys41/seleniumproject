package oHRMapplication_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LoginTest {

	WebDriver driver;
	String applicationURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	FileInputStream inputfile;
	FileOutputStream outputfile;
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	Row row;
	Cell cell;

	@BeforeTest
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

	}

	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	*/





	@Test(priority=1)
	public void login() throws IOException
	{
		inputfile=new FileInputStream("./Excel_path/Multiple_Testdata.xlsx");
		workBook=new XSSFWorkbook(inputfile);
		sheet=workBook.getSheet("Sheet3");

		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			int cellcount=sheet.getRow(i).getLastCellNum();
			for(int j=0;j<=cellcount;j++)
			{
				row=sheet.getRow(i);
				cell=row.getCell(j);

				String exceldata=cell.getStringCellValue();
				System.out.println(exceldata);
				System.out.println("@@@");

				By rowL=By.name("username");
				WebElement userName=driver.findElement(rowL);
				String rowData = userName.getText();
				
				userName.sendKeys(rowData);
				//System.out.println(userName);
				//System.out.println("############");
			}
				//Cell cell1=row.getCell(1);
				By passwordL=By.name("password");
				WebElement password=driver.findElement(passwordL);
				String cellData = password.getText();
				password.sendKeys(cellData);
				
				//System.out.println(password);


				By loginL= By.tagName("button");
				WebElement login=driver.findElement(loginL);
				login.click();

							
			
		}
		
	}
	

}
