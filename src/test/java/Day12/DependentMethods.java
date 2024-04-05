package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {
  @Test(priority=1)
  void openurl() {
	  Assert.assertTrue(true);
  }
  @Test(dependsOnMethods= {"openurl"})
  void login() {
	  Assert.assertTrue(true);
  }
  @Test(priority=3,dependsOnMethods= {"login"})
  void search() {
	  Assert.assertTrue(true);
  }
  @Test(priority=4,dependsOnMethods= {"login","search"})
  void advancedsearch() {
	  Assert.assertTrue(true);
  }
  @Test(priority=5,dependsOnMethods= {"login"})
  void logout() {
	  Assert.assertTrue(true);
  }
}