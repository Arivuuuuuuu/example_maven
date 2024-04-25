package Mouse_events;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		driver.manage().window().maximize();
//		
//		
//		Actions a=new Actions(driver);
//		
//		WebElement w=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//		
//		a.contextClick(w).perform();
//		
//		WebElement e=driver.findElement(By.xpath("/html/body/ul/li[4]/span"));
//		a.moveToElement(e).click().perform();
//		
//		Alert aa=driver.switchTo().alert();
//		aa.accept();
		
		
		
		//a.keyDown(Keys.ENTER).sendKeys("Ctrl").keyUp(Keys.ENTER);
			
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");

	}

}

