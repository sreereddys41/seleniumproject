package Browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("./Excel_path/123.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		//for(int i=1;i<=1;i++)
		//{
		Row row=sheet.getRow(1);
		
		Cell cellL=row.getCell(1);
		String cell=cellL.getStringCellValue();
		
		Cell cell1L=row.getCell(2);
		String cell1=cell1L.getStringCellValue();
		//Cell cell2=row.getCell(0);
		
		String str = cell;
		String str1=cell1;
		
		
		//System.getp("str");
				
		System.getProperty("str", "str1");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		/*
		String x=driver.getTitle();
		System.out.println("Title of Google page is: "+x);
		String y="Google";
		
		if(x==y)
		{
			System.out.println("Google page titles matches with each other");
		}
		else
		{
			System.out.println("It doesnt match with each other");
		}
		*/
	}

}
