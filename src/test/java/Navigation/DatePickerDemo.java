package Navigation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//approach 1
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/15/2024");
		
		//approach 2
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year = "2020";
		String month = "December";
		String date = "25";
		
		//selecting month and year 
		
		while(true) {
			
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			if (year.equals(yr) && month.equals(mon)) {
				
				break;
				
			}
			//future dates
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
			//past dates
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//selecting date
		
		//1st way
		List <WebElement> alldates = driver.findElements(By.xpath("//*[@class = \"ui-datepicker-calendar\"]//td"));
		
		/*for(WebElement dates: alldates) {
			
			if(dates.getText().equals(date)) {
				dates.click();
				break;
			}
		}*/
		
		//2nd way
		for(int i = 0; i < alldates.size(); i++) {
			if(alldates.get(i).getText().equals(date)) {
				alldates.get(i).click();
			}
		}
	}
}
