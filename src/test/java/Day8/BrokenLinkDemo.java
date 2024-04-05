package Day8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinkDemo {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Total no. of links on the webpage
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size());
		
		int brokenlink = 0;
		
		for(WebElement linkElement: links) {
			String hrefValue = linkElement.getAttribute("href");
			
			if(hrefValue == null || hrefValue.isEmpty()) {
				System.out.println("href value is empty");
				continue;
			}
			
			//connection
			@SuppressWarnings("deprecation")
			URL linkurl = new URL(hrefValue);
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
			
			conn.connect();
			
			if(conn.getResponseCode()>400) {
				System.out.println(hrefValue + " " + "Broken Link");
				brokenlink++;
			}
			else {
				System.out.println(hrefValue + " " + "Not Broken Link");
			}
		}
		System.out.println("Total no. of Broken links are: " + brokenlink);
		
	}

}
