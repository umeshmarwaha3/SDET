package Day10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketDemo {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		
		WebElement drop = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		WebElement drop2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		
		Select drp = new Select(drop);
		Select drp2 = new Select(drop2);
		
		drp.selectByVisibleText("Portland");
		drp2.selectByVisibleText("Berlin");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/table"));
		 
		 WebElement row1 = driver.findElement(By.tagName("tr"));
		 row1.getSize();
		 System.out.println("The total no of rows are: " + row1);
	}
}