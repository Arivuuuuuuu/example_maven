package end_to_end;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class end {

	private static char[] c_price;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("fromPort")).click();
		
		Thread.sleep(5000);
		
		Select s=new Select(driver.findElement(By.name("fromPort")));
		s.selectByIndex(3);
		
		
		Select s1=new Select(driver.findElement(By.name("toPort")));
		s1.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//String arr[]=new String[5];
		
	    List<WebElement> ss=driver.findElements(By.xpath("//table//tbody//tr"));
	    int size=ss.size();
	    System.out.println(size);
	    
	   String arr[]=new String[size];
	    
	    for(int i=1;i<=size;i++) {
	    	String text=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
	    	//String c_price=text.replace("$","");
			//int price=Integer.parseInt(c_price);
	    	
	    	System.out.println(text);
	    	
	    	arr[i-1]=text;
	    }
	    
	    Arrays.sort(arr);
	    String lowest_price=arr[0];
	    System.out.println("The lowest price:"+ lowest_price);
	    
	    for(int r=1;r<size;r++) {
	    
	    if(driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText().equals(lowest_price)) {
	    	driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[1]")).click();
	    	break;
	        }
	    }
	    
	    driver.findElement(By.id("inputName")).sendKeys("arivv"); 
	    
	    driver.findElement(By.id("address")).sendKeys("navalur");
	    
	    driver.findElement(By.id("city")).sendKeys("Chennai");
	    
	    driver.findElement(By.id("state")).sendKeys("TamilNadu");
	    
	    driver.findElement(By.id("zipCode")).sendKeys("604202");
	    
	    Select sss=new Select(driver.findElement(By.id("cardType")));
	    sss.selectByIndex(2);
	    
	    driver.findElement(By.id("creditCardNumber")).sendKeys("6100");
	    
	    driver.findElement(By.id("creditCardMonth")).sendKeys("7");
	    
	    driver.findElement(By.id("creditCardYear")).sendKeys("2023");
	    
	    driver.findElement(By.id("nameOnCard")).sendKeys("chief");
	    
	    driver.findElement(By.id("rememberMe")).click();
	    
	    driver.findElement(By.xpath("//input[contains(@class,'btn')]")).click();
	    
	  
	    

	    
	    
	    
	    
		
		

	}

}
