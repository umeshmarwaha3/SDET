package Day12;

import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParamTest {
  WebDriver driver;
  
  @BeforeClass
  @Parameters({"browser","url"})
  void setup(String br, String appUrl) throws InterruptedException {
	  
	  if(br.equals("chrome")) {
	  driver = new ChromeDriver();
	  }
	  else{
	  driver = new EdgeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get(appUrl);
	  Thread.sleep(3000);
  }
  
  @Test(priority=2)
void testLogo() {
	  try {
		  boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  Assert.assertEquals(status, true);
	  }
	  catch(Exception e) {
		  Assert.fail();
	  }
  }
 
  @Test
void testLogin() {
	  driver.findElement(By.id("username")).sendKeys("Admin");
	  driver.findElement(By.id("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  String exp_title = "OrangeHRM";
	  String act_title = driver.getTitle();
	
	  Assert.assertEquals(exp_title	, act_title);
  }
 
  @Test
void testHomePageTitle() {
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Titles are not matched...");
  }
 
  @AfterClass
  void tearUp() {
	  driver.quit();
  }
}
