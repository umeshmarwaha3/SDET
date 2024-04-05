package Day8;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
		//fullpage ss
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		/*File src = ss.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("D:\\Apps\\Eclipse IDE\\Work\\Selenium_Maven\\Screenshots\\fullpage.png");
		
		FileUtils.copyFile(src, trg);*/
		
		//specific location ss
		WebElement featuredproduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src = featuredproduct.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("D:\\Apps\\Eclipse IDE\\Work\\Selenium_Maven\\Screenshots\\featured_products.png");
		
		FileUtils.copyFile(src, trg);
		
		System.out.println("Screenshot Taken");
	}

}
