package Day12;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	//run a single test multiple times
  @Test(invocationCount=10)
  void test() {
	  System.out.println("Testing......");
  }
}