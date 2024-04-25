package handleframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement pass=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(pass);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hellow bruhhh");
		
		driver.switchTo().defaultContent();
		
		WebElement pass1=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(pass1);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("bruhhh");
		
		driver.switchTo().defaultContent();
		
		WebElement pass2=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(pass2);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("chef");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		
		
		
		

	}

}
