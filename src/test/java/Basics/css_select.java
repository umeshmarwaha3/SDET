package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_select {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Nike");
	}
}
