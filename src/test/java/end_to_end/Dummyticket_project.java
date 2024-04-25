package end_to_end;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummyticket_project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("product_551")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement fname=driver.findElement(By.xpath("//input[@id='travname']"));		
		js.executeScript("arguments[0].setAttribute('value','arivvv')", fname);
		Thread.sleep(5000);
		
        WebElement lname=driver.findElement(By.xpath("//input[@id='travlastname']"));	
        //js.executeScript("arguments[0].click();",lname);
		js.executeScript("arguments[0].setAttribute('value','bhaiii')", lname);		
		Thread.sleep(7000);
		
//		WebElement notes=driver.findElement(By.id("order_comments"));
//	    js.executeScript("arguments[0].setAttribute('id','simply waste')", notes);
	    //js.executeScript("arguments[0].click();",notes);
		
		driver.findElement(By.id("order_comments")).sendKeys("simply waste");
		
		driver.findElement(By.id("dob")).click();	
		
		Select s=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//select[1]")));
		s.selectByIndex(9);
		
		Select s1=new Select(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//select[2]")));
		s1.selectByVisibleText("2001");
		
		String date="6";
		
		List<WebElement>li=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
		for( WebElement l:li) {
			if(l.getText().equals(date)) {
				l.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("fromcity")).sendKeys("chennai");
		
		driver.findElement(By.name("tocity")).sendKeys("vietnam");
		
		driver.findElement(By.name("departon")).click();
		
		Select se=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		se.selectByIndex(4);
		
		Select se1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		se1.selectByVisibleText("2024");
		
		Thread.sleep(5000);
		
		String datee="10";
		
		List<WebElement>lii=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
		//System.out.println(lii);
		
		for( WebElement list:lii) {
			if(list.getText().equals(datee)) {
				list.click();
				break;
			}
		}
		
		driver.findElement(By.id("notes")).sendKeys("get lost");
		
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//*[@id=\"reasondummy_field\"]/span/span/span[1]/span/span[2]")).click();
		
		driver.findElement(By.xpath("//li[text()='Prank a friend']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("deliverymethod")).click();
		
		driver.findElement(By.id("billname")).sendKeys("hello jii");
		
		driver.findElement(By.id("billing_phone")).sendKeys("8072831499");
		
		driver.findElement(By.id("billing_email")).sendKeys("arivuuu@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[text()='Jamaica']")).click();		
		
		driver.findElement(By.name("billing_address_1")).sendKeys("Gingee");
		
		driver.findElement(By.name("billing_address_2")).sendKeys("Navalur");
		
		driver.findElement(By.name("billing_city")).sendKeys("Gingee");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")).click();
		
		driver.findElement(By.xpath("//li[text()='Manchester']")).click();
		
		driver.findElement(By.name("billing_postcode")).sendKeys("604202");
		
		driver.findElement(By.id("place_order")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
