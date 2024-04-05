package Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set <String> windowids = driver.getWindowHandles();
		 
		 //Approach--1   List--Arraylist.set
		 /*List <String> al = new ArrayList(windowsids);  //set is converted into arraylist
		
		 String parentwindowsid = al.get(0);
		 String childwindowsid = al.get(1);
		 
		 driver.switchTo().window(childwindowsid);
		 
		 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(parentwindowsid);
		 
		 driver.findElement(By.name("username")).sendKeys("12345");*/
		 
		 //Approach--2
		 Set <String> windowsids = driver.getWindowHandles();
		 
		 for(String winid:windowids) {
			 
			 String title = driver.switchTo().window(winid).getTitle();
			 
			 if(title.equals("Human Resources Management Software | OrangeHRM)")) {
				 
				 Thread.sleep(3000);
				 
				 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
				 
				 System.out.println(driver.getTitle());
			 }
			 else if(title.equals("OrangeHRM")) {
				 
				 Thread.sleep(2000);
				 
				 driver.findElement(By.name("username")).sendKeys("12345");
			 }
		 }
	}
}