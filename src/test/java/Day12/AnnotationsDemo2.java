package Day12;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class AnnotationsDemo2 {
  @BeforeSuite
  public void Login() {
  }
  @BeforeClass
  public void Search() {
  }
  @AfterClass
  public void AdvancedSearch() {
  }
  @AfterSuite
  public void Logout() {
  }
}
