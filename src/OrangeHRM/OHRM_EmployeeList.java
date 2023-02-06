package OrangeHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import oHRMapplication_Assignment.BaseTest;

public class OHRM_EmployeeList  {


	WebDriver driver;
	String applicationURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@BeforeTest
	public void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();


		By PIML=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
		WebElement PIM=driver.findElement(PIML);
		PIM.click();

		WebElement emplist=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
		emplist.click();
		Thread.sleep(5000);
	}

	@Test
	public void Employeelist() throws IOException
	{

		FileInputStream file=new FileInputStream("./Excel_path/emplist.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");

		WebElement emptableL=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]"));

		for(int i=1;i<=50;i++)
		{
			Row row=sheet.createRow(i);
			//WebElement emprow=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div"));
			for(int j=1;j<=8;j++)
			{
			
				WebElement element=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div["+i+"]/div/div["+j+"]"));
				String val=element.getText();
				System.out.print(val);

				
				Cell cell=row.createCell(j);
				cell.setCellValue(val+" ");
			}
			System.out.println();
			FileOutputStream file1=new FileOutputStream("./Excel_path/emplist.xlsx");
			workBook.write(file1);
			}
			System.out.println();

		}
	
	
	}

