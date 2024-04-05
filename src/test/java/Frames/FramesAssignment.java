package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Entering Frame 2.");
		
		WebElement frame = driver.findElement(By.xpath("(//iframe[@id='frm2'])[1]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Umesh");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Marwaha");
		
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umesh@abc.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("umesh123");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Exited Frame 2.");
			
	}
}
