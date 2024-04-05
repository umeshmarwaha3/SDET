package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops");   //1st way
		
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("Tops");    //2nd way
		
		driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops");    //3rd way
		
		//driver.close();
	}

}
