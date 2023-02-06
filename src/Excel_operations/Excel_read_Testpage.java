package Excel_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_read_Testpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Selenium Project\\seleniumproject\\Excel_path\\Testpage.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		
		Cell cell=row.getCell(0);
		
		String testData=cell.getStringCellValue();
		System.out.println(testData);

	}

}
