package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Debit
		WebElement accountbox1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement account1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		
		WebElement amountbox1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement amount1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
		
		Actions act = new Actions(driver);
				
		act.dragAndDrop(account1, accountbox1).perform();
		act.dragAndDrop(amount1, amountbox1).perform();
		
		//Credit
		WebElement accountbox2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement account2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		WebElement amountbox2 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		WebElement amount2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
		act.dragAndDrop(account2, accountbox2).perform();
		act.dragAndDrop(amount2, amountbox2).perform();
		
/*		WebElement perfect = driver.findElement(By.xpath("<a class=\"button button-green\">Perfect!</a>"));
		
		if(perfect.equals("Perfect!")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}*/
		
		driver.close();
		
	}
}
