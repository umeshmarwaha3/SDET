package Navigation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		mywait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
	
		alert.accept();
		
		//String text = driver.findElement(By.id("result")).getText();
		
		/*if(text.equals("You clicked: Ok"))
			
			System.out.println("Test Passed.");
		else
			System.out.println("Test Failed");*/
	
	}
	}

