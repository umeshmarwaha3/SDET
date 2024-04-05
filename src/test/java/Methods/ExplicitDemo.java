package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//declaration 1st step
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		}

}
