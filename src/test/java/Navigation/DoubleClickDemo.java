package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("");
		
		WebElement f1 = driver.findElement(By.xpath(""));
		
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button = driver.findElement(By.xpath(""));
		
		Actions act = new Actions(driver);
		
		// perform double click on web element
		act.doubleClick(button).perform();
		
		//validations		
		WebElement f2 = driver.findElement(By.xpath(""));
	

		String text = f2.getText();
		
		if(text.equals("Welcome")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
