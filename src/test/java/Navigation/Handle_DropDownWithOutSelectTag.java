package Navigation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DropDownWithOutSelectTag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List <WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		System.out.println("The total element in dropdown are " + list.size());
		
	}
}
