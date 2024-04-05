package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo5 {    //RelativeLocator

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//find element by nearby elements
		
		Thread.sleep(4000);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(username)).sendKeys("Hello");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Hello");
	}

}
