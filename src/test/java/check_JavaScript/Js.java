package check_JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://webapps.tekstac.com/Agent_Registration/");
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		//WebElement e=driver.findElement(By.xpath("//h2[text()='Deals in PCs']"));
		
		//j.executeScript("window.scrollBy(0,3000)");
		
		//j.executeScript("arguments[0].scrollIntoView()",e);
		
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
       
		
		
//		WebElement a=driver.findElement(By.name("firstname"));		
//		j.executeScript("arguments[0].setAttribute('value','arivv')", a);
		
//		Object name = j.executeScript("return document.getElementsByName('firstname')[0]");
//		((WebElement)name).sendKeys("ari");
//		
//		WebElement b=driver.findElement(By.name("lastname"));		
//		j.executeScript("arguments[0].setAttribute('value','bruhh')", b);
//		
//		WebElement c=driver.findElement(By.name("username"));		
//		j.executeScript("arguments[0].setAttribute('value','jiii')", c);
//		
//		WebElement e=driver.findElement(By.name("password"));		
//		j.executeScript("arguments[0].setAttribute('value','6104')", e);
//		
//		WebElement f=driver.findElement(By.name("phonenumber"));		
//		j.executeScript("arguments[0].setAttribute('value','8072831499')", f);
//		
//		WebElement g=driver.findElement(By.name("email"));		
//		j.executeScript("arguments[0].setAttribute('value','arivu06@gmail.com')", g);
//		
//		Thread.sleep(3000);
//		
////		WebElement submit=driver.findElement(By.id("submit"));		
////		j.executeScript("arguments[0].click();", submit);
//		
//		Object sumit=j.executeScript("return document.getElementById('submit')");
//		((WebElement)sumit).click();
		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		WebElement reset=driver.findElement(By.id("reset"));		
//		j.executeScript("arguments[0].click();", reset);
		
//		WebElement e=driver.findElement(By.id("submit"));
//		
//		j.executeScript("arguments[0].click()",e);
	}

}
