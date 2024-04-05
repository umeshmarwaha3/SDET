package Day9;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\ExcelFiles\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//1st way     for name
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		//2nd way
		//XSSFSheet sheet = workbook.getSheet(0);
		
		//row no.
		int rows = sheet.getLastRowNum();
		
		//column no.
		int col = sheet.getRow(1).getLastCellNum();
		
		System.out.println("The no. of rows are: " + rows);
		
		System.out.println("The no. of columns are: " + col);
		
		for(int r=0; r<=rows; r++) {
			
			XSSFRow currentrow= sheet.getRow(r);
			
			for(int c=0; c<col; c++) {
			
			//	XSSFCell cellValue = currentrow.getCell(c);
			//	String cell = cellValue.toString();
				String cellvalue = currentrow.getCell(c).toString();
				System.out.print(cellvalue + "  ");
			}
			System.out.println(); //formatting
		}
		workbook.close();
		file.close();
	}
}