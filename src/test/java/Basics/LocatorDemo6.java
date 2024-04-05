package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo6 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/");
		WebElement book6 = driver.findElement(By.id("pid6"));
		
		String book5 = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(book6)).getText();
		System.out.println(book5);
		
		String book3 = driver.findElement(RelativeLocator.with(By.tagName("li")).above(book6)).getText();
		System.out.println(book3);
		
		String book7 = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(book6)).getText();
		System.out.println(book7);
		
		driver.close();
	}

}
