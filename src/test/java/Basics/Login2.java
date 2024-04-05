package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {

	public static void main(String[] args)  throws InterruptedException {   
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
		
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
