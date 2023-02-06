package Excel_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_multipledata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("./Excel_path/Multiple_Testdata.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet2");
		int rowCount=sheet.getLastRowNum();
		
		for(int rowindex=0;rowindex<=rowCount;rowindex++)
		{
			int cellCount=sheet.getRow(rowindex).getLastCellNum();
			
			for(int cellIndex=0;cellIndex<cellCount;cellIndex++)
			{
				
				Row row=sheet.getRow(rowindex);
						
				Cell cell=row.getCell(cellIndex);
				
				String data=cell.getStringCellValue();
				
						
				System.out.print(data+" ");
			}
			System.out.println();
						 
		}
		

	}

}
