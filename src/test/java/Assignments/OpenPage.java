package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}
