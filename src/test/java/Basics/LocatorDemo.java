package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		
		driver.findElement(By.name("submit_search")).click();
		
		//driver.findElement(By.linkText("Faded short sleeve t-shirt")).click();
		
		driver.findElement(By.partialLinkText("Faded Short")).click();
		
		System.out.println("Successfully Executed..");
		
		driver.close();
	}

}
