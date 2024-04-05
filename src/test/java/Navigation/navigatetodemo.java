package Navigation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetodemo {

	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.amazon.in/");  //1st type
		
		System.out.println(driver.getCurrentUrl());
		
		URL url = new URL("https://www.flipkart.com/");  //2nd type
		
		driver.navigate().to(url);
		
		System.out.println(driver.getCurrentUrl());  // to print current url
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		}

}
