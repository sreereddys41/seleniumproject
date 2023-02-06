package DateAndTime_Appln;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DateAppln_ExcelWrite extends date_Time_Appln {
	
	public void exporting_to_excel() throws IOException
	{
		FileInputStream file=new FileInputStream("./Excel_path/Testpage1.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		
		By tableXpathL=By.xpath("/html/body/div[5]/section[1]/div");
		
		WebElement webtable=driver.findElement(tableXpathL);
		
		By rowsL=By.tagName("tr");
		List<WebElement>rows=webtable.findElements(rowsL);
		//System.out.println(rows);
		for(int rowindex=0;rowindex<rows.size();rowindex++)
		{
			By cellL=By.tagName("td");
			List<WebElement>rowsofCell=rows.get(rowindex).findElements(cellL);
			Row newrow=sheet.createRow(rowindex);
			
			//System.out.println(rowsofCell);
			
			for (int rowofcell=0;rowofcell<rowsofCell.size();rowofcell++)
			{
				String data=rowsofCell.get(rowofcell).getText();
				System.out.print(data);
			
				Cell newcell=newrow.createCell(rowofcell);
				newcell.setCellValue(data);
			}
						
		FileOutputStream file1=new FileOutputStream("./Excel_path/Testpage1.xlsx");
		workBook.write(file1);
		System.out.println();
			} 
			
		}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		DateAppln_ExcelWrite Excelwrite=new DateAppln_ExcelWrite();
		Excelwrite.setup();
		//Excelwrite.worldclock();
		Excelwrite.exporting_to_excel();
		
	}
}

