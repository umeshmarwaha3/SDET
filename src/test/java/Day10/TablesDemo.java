package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TablesDemo {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int row = driver.findElement(By.xpath("//table[@name='BookTable']//tr"));
		
		int col = driver.findElement(By.xpath("//table[@name='BookTable']//th"));
		
		String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]"));
		
		System.out.println(text);
		
		for(int r=2; r<=row; r++) {
			for(int c=1;c<=col;c++) {
				
			}
		}
	}
}