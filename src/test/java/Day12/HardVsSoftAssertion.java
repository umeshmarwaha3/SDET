package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
  @Test
  void HardAssertion() {
	  
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  
	  Assert.assertTrue(false);
	  
	  //Once the assertion failed then the execution stops there and doesn't move forward.
	  System.out.println("This is the example of hard assertion.");
	  Assert.assertTrue(true);
	  Assert.assertTrue(true);
	  Assert.assertTrue(true);
  }
  @Test
  void SoftAssertion() {
	  
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  System.out.println("Testing ......");
	  
	  SoftAssert sa = new SoftAssert();//required
	  
	  sa.assertTrue(false);
	  
	  //if the assertion fails still it executes till the last assertion.
	  System.out.println("This is the example of soft assertion.");
	  
	  sa.assertTrue(true);
	  sa.assertTrue(true);
	  sa.assertTrue(true);
	  
	  //required
	  sa.assertAll();
  }
}
