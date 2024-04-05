package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Cases
//1) Open Web Browser.
//2) Open URL https://demo.guru99.com/test/newtours/index.php
//3) Enter username
//4) Enter password
//5) Click on Login
//6) Capture title of homepage.
//7) Verify title of homepage.
//8) Close browser.

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
		String act_value = driver.getTitle();
		String exp_value = "Login: Mercury Tours";
		
		if(act_value.equals(exp_value)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		
		driver.close();
	}
}
