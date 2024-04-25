package datePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_in_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		//selecting month
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		
		Thread.sleep(5000);
		
		Select s=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		
		s.selectByIndex(9);
		
		//selecting year
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		
		Select s1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s1.selectByVisibleText("2001");
		
		//select date
		
		String date="6";
		
		List<WebElement> lis=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		System.out.println(lis.size());
		
		for(WebElement l:lis) {
			if(l.getText().equals(date)){
				l.click();
				break;
			}
		}
	}

}
