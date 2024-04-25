package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//by using sendKeys;
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/10/2022");
		
		//without using sendKeys;
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String m="May";
		String y="2025";
		String d="10";
		
		while(true) {
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(m.equals(month)&&y.equals(year)) {
				driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).click();
				driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).click();
				break;
			}else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		
		List<WebElement>li=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));

		for(WebElement l:li) {
			
			if(l.getText().equals(d)) {
		       l.click();
		       break;
			}
		}
		
		
		

	}

}
