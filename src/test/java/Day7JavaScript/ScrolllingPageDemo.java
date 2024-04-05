package Day7JavaScript;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class ScrolllingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		//driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js = driver;
		
		Thread.sleep(3000);
		
		//js.executeScript("window.scrollBY(0,3000)", "");
		
		/*js.executeScript("window.scrollBy(0,300)", "");
		
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
		
		//Scrolldown to a specific element
		WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		
		System.out.println(js.executeScript("return window.pageYOffset;", ""));	*/
		
		//Scroll to the end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
		
		driver.close();
	}
}