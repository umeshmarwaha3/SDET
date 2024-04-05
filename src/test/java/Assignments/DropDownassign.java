package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownassign {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	
		WebElement drop = driver.findElement(By.xpath("//select[@id='country-list']"));
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='state-list']"));
		
		Select drp1 = new Select(drop);
		drp1.selectByVisibleText("India");
		WebElement out1 = drp1.getFirstSelectedOption();
		System.out.println(out1.getText());

		Select drp2 = new Select(drop2);
		drp2.selectByVisibleText("Delhi");
		WebElement out2 = drp2.getFirstSelectedOption();
		System.out.println(out2.getText());
	}
}
