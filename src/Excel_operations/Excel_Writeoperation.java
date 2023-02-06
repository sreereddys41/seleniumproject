package Excel_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Writeoperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("./Excel_path/Testpage.xlsx");
		
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		Row row=sheet.createRow(2);
		
		Cell cell=row.createCell(3);
		
		cell.setCellValue("Testing Automation");
		
		FileOutputStream file1=new FileOutputStream("./Excel_path/Testpage.xlsx");
		workBook.write(file1);
		

	}

}
