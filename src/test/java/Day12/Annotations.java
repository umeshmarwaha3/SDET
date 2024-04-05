package Day12;

import org.testng.annotations.*;

public class Annotations {
  @BeforeMethod
  public void login() {
	  System.out.println("Login..");
  }
  @Test(priority=1)
  public void search() {
	  System.out.println("Search Functionality..");
  }
  @Test(priority=2)
  public void advancedsearch() {
	  System.out.println("Advanced Search Functionality..");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Logout..");
  }
}