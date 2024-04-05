package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Hi This is frame 1.");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hi This is frame 2.");
		
	}

}