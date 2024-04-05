package Navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		WebElement Desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		WebElement Mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover --- movetoElement
		
		//act.moveToElement(Desktops).moveToElement(Mac).click().build().perform();
		
		act.moveToElement(Desktops).moveToElement(Mac).click().perform();
		
		Thread.sleep(5000);
	}
}
