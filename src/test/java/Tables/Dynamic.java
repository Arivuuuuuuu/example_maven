package Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			
			driver.get("https://demo.opencart.com/admin/");
			driver.manage().window().maximize();
			
			WebElement a=driver.findElement(By.name("username"));
			a.clear();
			a.sendKeys("demo");
			
			WebElement p=driver.findElement(By.name("password"));
			p.clear();
			p.sendKeys("demo");
			
			driver.findElement(By.xpath("//button[contains(@class,'btn')]")).click();
			
			/*Thread.sleep(10000);
			
			if(driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed()) {
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			}*/
			
			Thread.sleep(10000);
			
			if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
				driver.findElement(By.xpath("//button[@class='btn-close']")).click();	
			}
			
			driver.findElement(By.xpath("//li[@id='menu-customer']//a[contains(@class,'parent')]")).click();
			
			driver.findElement(By.xpath("//a[text()='Customers']")).click();
			
			Thread.sleep(5000);
			
			WebElement page=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']"));
			String page_count=page.getText();
			System.out.println(page_count);
			
			String pg=page_count.substring(page_count.indexOf("(")+1, page_count.indexOf("Pages")-1);
			int count=Integer.parseInt(pg);
			System.out.println(count);
			
		    WebElement p1=driver.findElement(By.xpath("//ul[@class='pagination']"));
		    String p2=p1.getText();
			int p3=Integer.parseInt(p2);
			
			
			for(int k=1;k<=3;k++) {
				if(count>1) {
					
					WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='2']"));
					//String pgg=click.getText();	
					System.out.println(active_page.getText());
					active_page.click();
					Thread.sleep(3000);
				}
				
			}
			
			/*List <WebElement>rows=driver.findElements(By.xpath("//table[contains(@class,'table')]//tr"));
			int n_rows=rows.size();
			System.out.println(n_rows);
			
		    for(int r=2;r<=n_rows;r++) {
				WebElement email=	
						
			}*/
			
			

		}

	}


