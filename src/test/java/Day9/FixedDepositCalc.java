package Day9;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalc {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		//path of excel file
		String file = System.getProperty("user.dir") + "\\ExcelFiles\\Caldata.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		//read the data from excel file
		for(int i=1; i<=rows; i++) {
			
			String princi = ExcelUtils.getCellData(file, "Sheet1", i, 0);
			String rateofInterest = ExcelUtils.getCellData(file, "Sheet1", i, 1);
			String Period1 = ExcelUtils.getCellData(file, "Sheet1", i, 2);
			String Period2 = ExcelUtils.getCellData(file, "Sheet1", i, 3);
			String Frequency = ExcelUtils.getCellData(file, "Sheet1", i, 4);
			String MaturityValue = ExcelUtils.getCellData(file, "Sheet1", i, 5);
		
		//pass the data to application
		driver.findElement(By.name("principal")).sendKeys(princi);
		driver.findElement(By.id("interest")).sendKeys(rateofInterest);
		driver.findElement(By.id("tenure")).sendKeys(Period1);
		Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
		perdrp.selectByVisibleText(Period2);
		
		Select ferdrp = new Select(driver.findElement(By.id("frequency")));
		ferdrp.selectByVisibleText(Frequency);
		
		//clicking on calculate button
		//driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
		JavascriptExecutor js  = driver;
		
		WebElement calculatebtn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
		js.executeScript("arguments[0].click()", calculatebtn);
		
		String act_value = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]")).getText();
		
		if(Double.parseDouble(MaturityValue)==Double.parseDouble(act_value)) {
			System.out.println("Test Passed");   //printing in console
			
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
		}
		else {
			System.out.println("Test Failed");
			
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
		}
		}
		//clicking on clear button
		JavascriptExecutor js = driver;
		WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
		js.executeScript("arguments[0].click();",clear_btn);
		
			
	}
	}