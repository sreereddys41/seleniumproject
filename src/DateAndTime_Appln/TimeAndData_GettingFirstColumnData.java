package DateAndTime_Appln;


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

public class TimeAndData_GettingFirstColumnData {
	WebDriver driver;
	public void applicationLaunch()
	{

		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./browserdriverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}
	public void applicationclose()
	{
		driver.quit();	

	}
     public void getFirstColumnData() throws IOException
     {
      String xpathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["; 
      String xpathExpression2="]/td[1]";
      FileInputStream file =new FileInputStream("./Excel_path/123.xlsx");
		 
	  XSSFWorkbook workBook=new XSSFWorkbook(file);
	 XSSFSheet sheet=workBook.getSheet("Sheet1");
	 
      for(int index=1; index<=36;index++)
      {
    	 By xpathRowLocator=By.xpath(xpathExpression1+index+xpathExpression2);
    	 WebElement cityName=driver.findElement(xpathRowLocator);
    	
    	Row row=sheet.createRow(index);
		Cell cell=row.createCell(0);	
    	
		String cityNameText=cityName.getText();
    	System.out.println(cityNameText);
	      
      }
      FileOutputStream file1= new FileOutputStream("./Excel_path/123.xlsx");
      workBook.write(file1);
     }
     public static void main(String[]args) throws IOException {
     
    	 TimeAndData_GettingFirstColumnData gfcd=new TimeAndData_GettingFirstColumnData();
    	 gfcd.applicationLaunch();
    	 gfcd.getFirstColumnData();
    	 
     
     }
     }