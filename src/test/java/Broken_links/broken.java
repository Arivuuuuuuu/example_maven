package Broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broken {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		
		int brokenLinks=0;
		
		for(WebElement w:l) {
			String href=w.getAttribute("href");
			
			if(href==null || href.isEmpty()) {
				System.out.println("not a broken link");
				continue;
			}
			
			URL link=new URL(href);
			
			HttpURLConnection conn=(HttpURLConnection)link.openConnection();
			
			conn.connect();
			
			int a=conn.getResponseCode();
			
			if(a>=400){
				brokenLinks++;
				System.out.println(href+" " +"is a broken link");
			
			}
			
			else {
				System.out.println(href+" " +"not a broken link");
			}
			
		}
		System.out.println(brokenLinks);
		
		

	}

}
