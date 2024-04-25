package checkAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ca {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://webapps.tekstac.com/MultipleWindow/");
		driver.manage().window().maximize();
		
		WebElement r=driver.findElement(By.xpath("//input[@type='submit']"));
		r.click();
		
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		a.accept();
		
		
		
		

	}

}
