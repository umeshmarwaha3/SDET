package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement Desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover - movetoElement()
		Thread.sleep(5000);
		
		act.moveToElement(Desktop).moveToElement(Mac).click().perform();
		
		Thread.sleep(5000);
	}

}
