package madhu_cc;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://webapps.tekstac.com/Users/");
		driver.manage().window().maximize();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		Object jsname=j.executeScript("return document.getElementsByName('name')[0]");
		((WebElement)jsname).sendKeys("arivv");
		
		Object jsaddress=j.executeScript("return document.getElementsByName('address')[0]");
		((WebElement)jsaddress).sendKeys("no 655");
		
		Object jsmobileno=j.executeScript("return document.getElementsByName('mobile')[0]");
		((WebElement)jsmobileno).sendKeys("8072831499");
		
		Object jsmail=j.executeScript("return document.getElementsByName('email')[0]");
		((WebElement)jsmail).sendKeys("arivv02@gmail.com");
		
		Thread.sleep(3000);
		
		Object jssubmit=j.executeScript("return document.getElementById('Submit')");
		((WebElement)jssubmit).click();
		
//		Object jsresult=j.executeScript("return document.getElementById('result')");
//		((WebElement)jsresult).getText();
//		
//		System.out.println(jsresult);
		
		Object jsresult = j.executeScript("return document.getElementById('result')");
		String text = ((WebElement)jsresult).getText();
		System.out.println(text);
		
		driver.navigate().refresh();
		
		 jssubmit=j.executeScript("return document.getElementById('Submit')");
		((WebElement)jssubmit).click();
		
		Thread.sleep(3000);
		
		Object nameerror=j.executeScript("return document.getElementById('nameWarning')");
		String ne=((WebElement)nameerror).getText();
		System.out.println(ne);
		
		Object mobileerror=j.executeScript("return document.getElementById('mobileWarning')");
		String nee=((WebElement)mobileerror).getText();
		System.out.println(nee);

		
		Object mailerror=j.executeScript("return document.getElementById('emailWarning')");
		String neee=((WebElement)mailerror).getText();
		System.out.println(neee);




	}

}
