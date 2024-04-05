package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	ChromeDriver driver;
	
  @BeforeClass
  void setup() {
	  driver = new ChromeDriver();
	  
  }
  @Test(dataProvider = "dp")
  void TestLogin(String email, String password) {
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("Email")).sendKeys(email);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  driver.findElement(By.xpath("//div[@class='master-wrapper-page']")).click();
	  
	  String exp_title = "nopCommerce demo store";
	  String act_title = driver.getTitle();
	
	  Assert.assertEquals(exp_title	, act_title);
  }
  @AfterClass
  void tearup() {
	  driver.close();
  }
  
  @DataProvider(name="dp", indices =(3))
  
  String[][] loginData(){
	
	  String[][] data = { {"abc@gmail.com","test"},
			  {"John@gmail.com","John@123"},
			  {"mk@gmail.com","test123"},
			  {"john@yahoo.com","john123"} 
			  };
	  
	  return data;
  }
}
