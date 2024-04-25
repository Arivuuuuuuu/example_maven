package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//for full page
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
      	File target=new File(".//"+"\\screenshots\\fullpage.png");
		
	    FileUtils.copyFile(src,target);
		
		
		//for particular webElement
		
//		WebElement e=driver.findElement(By.xpath("/html/body/div[3]/div/div/section[3]/div[1]/div/div[1]/div/p"));
//		
//		//TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File src=e.getScreenshotAs(OutputType.FILE);
//		
//		File target=new File("/C:\\Users\\2318333\\eclipse-workspace\\example_maven\\screenshots\\specific_element.png");
//		
//		FileUtils.copyFile(src,target);
//		
//		driver.quit();
//		
		
		

	}


	
}
