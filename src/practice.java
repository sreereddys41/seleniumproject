import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./browserdriverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		FileInputStream file=new FileInputStream("./Excel_path/Multiple_Testdata.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet3");
		
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0; i<=rowCount; i++){
			Row row = sheet.getRow(i);
			Cell cell = row.createCell(2);

			cell.setCellValue("WriteintoExcel");

			}

			FileOutputStream fos = new FileOutputStream("./Excel_path/Multiple_Testdata.xlsx");
			workBook.write(fos);
			fos.close();
			}

			}



