package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  void test() {
	  int x = 10;
	  int y = 20;
	  
	 /* if(x==y) 
		  System.out.println("Test is Passed.");
	  else
		  System.out.println("Test is Failed.");*/
	  
	  //hard assertion
	  //Assert.assertEquals(x, y); 
	  
	  //intentionally pass or fail
	 /* Assert.assertTrue(true); //pass
	  Assert.assertTrue(false);//fail*/
	  
	 // Assert.assertEquals(x>y, true, "x is not smaller than y.");
	  
	  /*String a1 = "abc";
	  String a2 = "abc1";
	  
	  Assert.assertEquals(a1, a2, "Both strings must be equal.");*/
	  
	  //if else using assertion
	  if(true) 
		  Assert.assertTrue(true);
	  
	  else 
		  Assert.assertTrue(false);
	  //or
	  Assert.fail();
	  
  }
}

