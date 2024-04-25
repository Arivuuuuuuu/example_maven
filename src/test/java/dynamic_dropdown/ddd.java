package dynamic_dropdown;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
		List<WebElement> total=driver.findElements(By.xpath("//div[@class='wM6W7d'][@role='presentation']"));
		
		System.out.println(total.size());
		
//		for(int i=0;i<total.size();i++) {
//			System.out.println(total.get(i).getText());
//		}
		
		for(WebElement a:total) {
			String list=a.getText();
			System.out.println(list);
		}
		

	}

}
