package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	//global variable
		WebDriver driver;
		
		//constructor
		LoginPage2(WebDriver driver){
			this.driver = driver;
			
			//here we dont use findElement();
			PageFactory.initElements(driver, this);//used for creating POM classes.
		}

		@FindBy(css="img[alt='company-branding']")
		WebElement logo;
		
		@FindBy(name = "username")
		WebElement user_name;
		
		@FindBy(name="password")
		WebElement pass_word;
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement clickbutton;
		
		//locate Element
		/*By logo = By.cssSelector("img[alt='company-branding']");
		By user_name = By.name("username");
		By pass_word = By.name("password");
		By clickbutton = By.xpath("//button[@type='submit']");*/
		
		
		//actions
		public void setUserName(String username) {
			user_name.sendKeys(username);	
		}	
		public void setpassword(String password) {
			pass_word.sendKeys(password);	
		}
		public void clickSubmit() {
			clickbutton.click();	
		}
		public Boolean checkLogo() {
			Boolean status = logo.isDisplayed();
			return status;
		}
}
