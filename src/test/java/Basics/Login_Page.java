package Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Page {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
	}
}
