package Navigation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='country-list']"));
		WebElement drop2 = driver.findElement(By.xpath("//select[@id='state-list']"));
		
		//Selecting an option from dropdown using select class
		
		Select drp = new Select(drop);
		Select drp2 = new Select(drop2);
		
		//By visibility text
		//drp.selectByVisibleText("India");
		//drp2.selectByVisibleText("Delhi");
		
		
		//Selct by Index
		//drp.selectByIndex(4);
		//drp2.selectByIndex(23);
		
		//Selecting  by Value
		//drp.selectByValue("4");
		//drp2.selectByValue("23");
		
		//Total no. of options in dropdown
		//List <WebElement> options = drp.getOptions();
		//List <WebElement> options = drp2.getOptions();
		
		//System.out.println(option.size());
		//System.out.println(options.size());
		
		//Print option on console
		/*for(int i = 0; i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		/*for(WebElement op:options) {
			System.out.println(op.getText());
		}*/
		WebElement state = driver.findElement(By.id("state-list"));
		
		Select drp1 = new Select(state);
		drp1.selectByIndex(3);
		
		Thread.sleep(5000);
		driver.close();
	}
}
