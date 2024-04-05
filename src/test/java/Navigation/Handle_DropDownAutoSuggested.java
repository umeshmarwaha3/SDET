package Navigation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DropDownAutoSuggested {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List <WebElement> drp = driver.findElements(By.xpath("//*[@class\"wM6W7d\"]//span"));
		
		System.out.println("The no of element in autodropdown is: " + drp.size());
		
	
	}
}
