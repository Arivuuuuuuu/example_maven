package alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//only ok
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert al=driver.switchTo().alert();
//		al.accept();
		
		
		//ok and cancel with getting that text
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert aa=driver.switchTo().alert();
//		//aa.getText();
//		//aa.accept();
//		
//		System.out.println(aa.getText());
//		
//		aa.dismiss();
		
//		String a_la=driver.findElement(By.xpath("//p[@id='result']")).getText();
//		String e_la="You clicked: Cancel";
//		
//		if(a_la.equals(e_la)) {
//			System.out.println("welcome");
//		}else {
//			System.out.println("get lost");
//		}
		
		//prompt type
		
		/*WebDriverWait wdw=new WebDriverWait(driver,(Duration.ofSeconds(2)));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		

		
		Alert at=wdw.until(ExpectedConditions.alertIsPresent());
		
		//System.out.println(at.getText());
		
		at.sendKeys("like");
		at.accept();
		
		String ss_act=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String ss_exp="You entered: like";
		if(ss_act.equals(ss_exp)) {
			System.out.println("hi chief");
		}
		else {
			System.out.println("poda dei");
		}*/
		
		
		
		
		

	}

}
