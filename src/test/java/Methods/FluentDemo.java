package Methods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		FluentWait mywait = new FluentWait(driver);
		
		mywait.withTimeout(Duration.ofSeconds(30));
		
		mywait.pollingEvery(Duration.ofSeconds(5));
		
		mywait.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
