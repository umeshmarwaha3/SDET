package Day14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BTESTest {
	WebDriver driver;
	
	BTESLogin log;
	
	@BeforeClass
  void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://182.76.176.205/hrm/login.php");
  }
	
	@Test(priority=2)
	void TestLogin() {
		log = new BTESLogin(driver);
		log.setUserName("admin");
		log.setPassword("admin");
		log.loginButton();
	}
	
	@Test
	void dropDown() {
		log = new BTESLogin(driver);
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
}
