package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		//Minimum Slider
		WebElement min = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
		System.out.println("Location of element" + min.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min, 100, 0).perform();
		
		System.out.println("Location of element" + min.getLocation());
		
		//Maximum Slider
		WebElement max = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		System.out.println("Location of element" + max.getLocation());
		
		act.dragAndDropBy(max, -100, 0).perform();
		
		System.out.println("Location of element" + max.getLocation());
	}
}