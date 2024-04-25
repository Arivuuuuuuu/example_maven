package cc;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cccc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://webapps.tekstac.com/FormRegistration/indexemi.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("submit")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
		driver.get("https://webapps.tekstac.com/FormRegistration/EMICalculator.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[@id='demo']")).click();
		
//		JavascriptExecutor j=(JavascriptExecutor)driver;
//		
//		WebElement aa =driver.findElement(By.xpath("//p[@id='demo']"));
//		j.executeScript("arguments[0].click();", a);
		
		Alert aaa=driver.switchTo().alert();
		aaa.sendKeys("john");
		aaa.accept();
		
		driver.findElement(By.id("amount")).sendKeys("6000");
		driver.findElement(By.id("year")).sendKeys("2");
		driver.findElement(By.id("roi")).sendKeys("2");
		
		driver.findElement(By.name("button")).click();
		

		Alert aa=driver.switchTo().alert();
		aa.accept();
		
		WebElement print=driver.findElement(By.id("msg"));
		System.out.println(print.getText());
		
		
		

	}

}
