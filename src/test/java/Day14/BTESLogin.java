package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BTESLogin {
	WebDriver driver;
 
	BTESLogin(WebDriver driver){
		this.driver = driver;
	}
	
	//elements
	By user_name = By.name("txtUserName");
	By pass_word = By.name("txtPassword");
	By button = By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input");
	By drop_down = By.xpath("//*[@id=\"pim\"]/a/span");
	
	
	//actions on elements
	public void setUserName(String username) {
		driver.findElement(user_name).sendKeys(username);
	}
	public void setPassword(String password) {
		driver.findElement(pass_word).sendKeys(password);
	}
	public void loginButton() {
		driver.findElement(button).click();
	}
	public void dropdown() {
		driver.findElement(drop_down);
	}
}
