package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
		//Approach1
		//driver.switchTo().frame("frm1");
		
		//Approach2
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='course']"));
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		
		Select dropdown = new Select(drop);
		
		Select dropdown2 = new Select(drop2);
		
		dropdown.selectByVisibleText("Java");
		dropdown2.selectByVisibleText("Tutorials");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='name']")).clear();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bye Frames");
	}
}