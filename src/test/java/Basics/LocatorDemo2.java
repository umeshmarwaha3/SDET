package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//classname
//tag
public class LocatorDemo2 {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		List <WebElement> sliders = driver.findElements(By.className("homeslider-container"));
			System.out.println("Total images are: " + sliders.size());
			
		List <WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("Total images are: " + image.size());
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size());
		
		driver.close();
	}

}
