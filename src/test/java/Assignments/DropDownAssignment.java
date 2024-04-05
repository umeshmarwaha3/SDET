package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
		Select drop = new Select(dropdown);
		
		drop.selectByVisibleText("India");	
	}
}
