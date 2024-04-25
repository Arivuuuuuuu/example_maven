package loop_check;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//div[text()='Chief Executive Officer']"));
		String b=a.getText();
		System.out.println(b);
		//System.out.println(li.size());
				
//		for(int i=0;i<li.size();i++) {
//			System.out.println(li.get(i).getText());
//		}
//		
//		driver.findElement(By.xpath("//div[@class='data']")).click();
		

	}

}
