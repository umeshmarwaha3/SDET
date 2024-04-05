package Day7JavaScript;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class InteractwithElementsJS {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = driver;
		
		//inputbox
		WebElement inputbox = driver.findElement(By.id("name"));
		
		//value = attribute
		js.executeScript("arguments[0].setAttribute('value','John')",inputbox);
		
		//radio button
		WebElement radio = driver.findElement(By.id("male"));
		//js.executeScript("arguments[0].click();"),radio;
		js.executeScript("arguments[0].click();",radio);
		
		Thread.sleep(3000);
		//submit button
		//WebElement button = driver.findElement(By.id("FSsubmit"));
		//js.executeScript("arguments[0].click();",button);
		
		//Email
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','abc@gmail.com')", email);
		
		//Phone Number
		WebElement num = driver.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('value', '1234567890')", num);
		
		//Dropdwon
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		js.executeScript("arguments[0].click();", drop);
		
		//Use Javascript Executor to select an option from dropdown
		String optionvalue = "india";  
		String script = "arguments[0].value ='" + optionvalue + "';";
		
		//String script = "arguments[0].setAtrribute('value','canada')";
		
		driver.executeScript(script, drop);
		
		//Verify selection if needed
		String selectedoption = (String) js.executeScript("return arguments[0].value;", drop);  
		System.out.println("Selected option is: " + selectedoption);
		
		
	}
}