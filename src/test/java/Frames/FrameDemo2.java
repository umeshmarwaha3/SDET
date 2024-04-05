package Frames;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo2 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement zx = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		
		driver.switchTo().frame(zx);
		
		driver.findElement(By.name("mytext1")).sendKeys("1234");
		
		driver.switchTo().defaultContent();
		
		WebElement cv = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		
		driver.switchTo().frame(cv);

		driver.findElement(By.name("mytext3")).sendKeys("ABCDE");
		
		driver.switchTo().defaultContent();
		
		WebElement frm3 = driver.findElement(By.xpath("/html/frameset/frame[3]"));
		
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.name("mytext3")).sendKeys("3333");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		
	}
}