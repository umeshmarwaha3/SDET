package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		driver.findElement(By.xpath("//*[@id=\"target\"]"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();	
		
		String text = driver.findElement(By.id("result")).getText();
		
		if(text.equals("You entered: ENTER")) {
		System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}
}