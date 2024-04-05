package Navigation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		//select single check box
		
		//driver.findElement(By.id("monday")).click();
		
		//count the no. of options in checkboxes
		List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type=\"checkbox\"]"));
		
		//System.out.println("The no. of checkboxes are: " + checkboxes.size());
		
		/*for(int i = 0; i < checkboxes.size(); i++) {      //1st way
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement chk: checkboxes) {    //2nd way
			chk.click();
		}*/
		
		
		//Select any option according to us
		/*for(int i = 5; i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		
		//Select 1st two checkboxes
		/*for(int i = 0; i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}*/
		
		//requirement is only to unselect if the checkbox is selected
		/*for(int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		
	/*	for(int i = 0; i < checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
		}*/
		
		//unselect 1st three checkboxes
		/*for(int i = 0; i < 3; i++) {
			checkboxes.get(i).click();
		}*/
		
		//unselect selected ones and select unselected ones
		for(int i = 0; i < 2; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		
		for(int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).isSelected();
			checkboxes.get(i).click();
		}
	}

}
