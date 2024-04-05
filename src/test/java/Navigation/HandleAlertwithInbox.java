package Navigation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertwithInbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.sendKeys("I am Popup Window!");
		
		alert.accept();
		
		//Validations
		String text = driver.findElement(By.id("result")).getText();

		if(text.equals("You entered: I am Popup Window!")) {
			System.out.println("Test Passed");}
		else {
			System.out.println("Test Failed");
	}
}
}
