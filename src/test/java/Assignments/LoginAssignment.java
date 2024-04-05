package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		String act_value = driver.getTitle();
		String exp_value = "OrangeHRM";
		
		if(act_value.equals(exp_value)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		driver.close();
	}
}
