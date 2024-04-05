package Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\ExcelFiles\\Book2.xlsx"); 
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		//without for loop/ less information
		/*XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("To");
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Welcome");
		row2.createCell(1).setCellValue("To");
		row2.createCell(2).setCellValue("Java");*/
		
		//with for loop
		Scanner sc = new Scanner(System.in);
		for(int r=0; r<3; r++) {
			XSSFRow currentrow = sheet.createRow(r);{
				for(int c=0; c<2; c++) {
					System.out.println("Enter the value of cell: ");
					
					String data = sc.next();
					
					currentrow.createCell(c).setCellValue(data);
				}
			}
		}
		
		workbook.write(file);  //writing data
		workbook.close();
		file.close();

		System.out.println("Writing of file is completed.");
	}
}