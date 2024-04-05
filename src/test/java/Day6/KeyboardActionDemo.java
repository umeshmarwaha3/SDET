package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello this is text box 1.");
		
		Actions act = new Actions(driver);
		
		//Control + A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//act.keyDown(Keys.CONTROL)
		//.sendKeys("a")
		//.keyUp(Keys.CONTROL)
		//.perform();
		
		//Control + C
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//Tab
		act.sendKeys(Keys.TAB);
		
		//Control + V
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
