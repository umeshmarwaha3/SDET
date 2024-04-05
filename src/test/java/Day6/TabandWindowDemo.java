package Day6;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class TabandWindowDemo {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//for new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//for new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.facebook.com/");
		
		driver.close();
	}
}
