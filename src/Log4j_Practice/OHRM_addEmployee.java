package Log4j_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OHRM_addEmployee {
	
	
	Logger log=Logger.getLogger("OHRM_addEmployee");
	
	@Test
	public void addemploye() throws IOException, InterruptedException
	{
	PropertyConfigurator.configure("Log4j.properties");
	System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.tagName("button")).click();
	log.info("Login Succesfully");
	
	By PIML=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	WebElement PIM=driver.findElement(PIML);
	PIM.click();
	{
	By addEmployeeL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
	WebElement addEmployee=driver.findElement(addEmployeeL);
	addEmployee.click();
	
	FileInputStream file=new FileInputStream("./Excel_path/addemployees.xlsx");

	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("sheet1");

	int rowCount=sheet.getLastRowNum();

	for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
	{

		Row row=sheet.getRow(rowIndex);

		Cell Firstname=row.getCell(0);

		String First_Name=Firstname.getStringCellValue();
		log.info(First_Name);

		Cell Middlename=row.getCell(1);

		String Middle_Name=Middlename.getStringCellValue();
		log.info(Middle_Name);
		
		Cell Lastname=row.getCell(2);

		String Last_Name=Lastname.getStringCellValue();
		log.info(Last_Name);

	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(First_Name);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).sendKeys(Middle_Name);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys(Last_Name);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	log.info("Employee added successfully");
	
	Thread.sleep(5000);
	
	
	
	Cell resultcell=row.createCell(3);
	resultcell.setCellValue("Successfully Added");
	FileOutputStream file1=new FileOutputStream("./Excel_path/addemployees.xlsx");
	workBook.write(file1);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	Thread.sleep(5000);
	
}
	
}

}
}
