package handling_browsers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows);
		List<String>window_ids=new ArrayList<String>(windows);
		
		String parent_id=window_ids.get(0);
		String child_id=window_ids.get(1);
		
		driver.switchTo().window(child_id);
		
		//driver.switchTo().window(parent_id);
		
//		Set <String> window=driver.getWindowHandles();
//		
//		for(String w:window) {
//			String title=driver.switchTo().window(w).getTitle();
//			if(title.equals("Human Resources Management Software | OrangeHRM")) {
//				driver.findElement(By.xpath("//li[4]//a[@class='nav-link-hed']")).click();
//			}
//			
//		}
		

	}

}
