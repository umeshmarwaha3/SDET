package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		
		String act_value = driver.getTitle();
		String exp_value = "Amazon.in Bestsellers: The most popular items on Amazon";
		
		if(act_value.equals(exp_value)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		driver.close();
	}
}