package dragAndDrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\\
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" http://webapps.tekstac.com/OnlineShopping/fashion.html");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		Thread.sleep(5000);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"Shirts\"]"));
		WebElement desti=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		a.dragAndDrop(source, desti).perform();
		

	}

}
