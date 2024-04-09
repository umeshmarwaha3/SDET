package Day11;

import org.testng.annotations.Test;

public class SecondTest {
  @Test(priority=10)
  void Login() {
	  System.out.println("This is Login.");
	  }
  @Test(priority=22)
  void Search() {
	  System.out.println("This is Search.");
	  }
  @Test(priority=54)
  void Logout() {
	  System.out.println("This is Logout.");
	  }
}
