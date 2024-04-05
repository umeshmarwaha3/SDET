package Navigation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		//Alert-- special class for handling the popups/alert window
		
		Alert alert = driver.switchTo().alert();   //driver moves to popup
		
		//driver.switchTo().alert();
		
		//Available in alert
		//accept()  -- click ok
		//dismiss()  -- click cancel
		//getText()  -- get the text of the popup
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//alert.accept();  //alert willl click on Ok
		
		alert.dismiss(); // alert will click on Cancel
		
		String text = driver.findElement(By.id("result")).getText();
		
		if(text.equals("You clicked: Ok"))
			
			System.out.println("Test Passed.");
		else
			System.out.println("Test Failed");
	}

}
