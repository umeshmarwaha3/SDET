package Day12;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(priority=1,groups= {"sanity","regression"})
  void loginbyEmail() {
	  System.out.println("Method is login by Email.");
  }
  @Test(priority=2, groups= {"sanity"})
  void loginbyFacebook() {
	  System.out.println("Method is login by Facebook.");
  }
  @Test(priority=3, groups= {"sanity"})
  void loginbyTwitter() {
	  System.out.println("Method is login by Twitter.");
  }
  @Test(priority=4,groups= {"sanity","regression"})
  void signupbyEmail() {
	  System.out.println("Method is signup by Email.");
  }
  @Test(priority=5,groups= {"regression"})
  void signupbyFacebook() {
	  System.out.println("Method is signup by Facebook.");
  }
  @Test(priority=6,groups= {"regression"})
  void signupbyTwitter() {
	  System.out.println("Method is signup by Twitter.");
  }
  @Test(priority=7,groups= {"sanity","regression"})
  void paymentinRupee() {
	  System.out.println("Method is payment by Rupees.");
  }
  @Test(priority=8,groups= {"sanity"})
  void paymentinDollar() {
	  System.out.println("Method is payment by Dollar.");
  }
  @Test(priority=9,groups= {"regression"})
  void paymentReturnbyBank() {
	  System.out.println("Method is payment returned by Bank.");
  }
}