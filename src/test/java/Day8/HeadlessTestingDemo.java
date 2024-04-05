package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessTestingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//Approach 1
		
		EdgeOptions option = new EdgeOptions();
		
		option.addArguments("--headless=new");
		
		WebDriver driver = new EdgeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
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
			System.out.println("Test is Passed.");
		}
		else {
			System.out.println("Test is Failed.");
		}
		
		driver.close();
	}
}
