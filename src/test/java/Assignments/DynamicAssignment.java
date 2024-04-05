package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List <WebElement> drp = driver.findElements(By.xpath("//*[@id=\"sa_5004\"]"));
		
		System.out.println("The no of element in autodropdown is: " + drp.size());
		
	}
}
