package Day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	//LoginPage lp;
	LoginPage2 lp;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	void TestLogin() {
		lp = new LoginPage2(driver);
		lp.setUserName("Admin");
		lp.setpassword("admin123");
		lp.clickSubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=1)
	void Logo_Check() {
		lp = new LoginPage2(driver);
		Assert.assertEquals(lp.checkLogo(), true);
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
}
