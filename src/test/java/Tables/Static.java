package Tables;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
				//total no of rows
				
				List<WebElement>li=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
				int rows=li.size();
				System.out.println(rows);
				
				//total no of columns
				
				List<WebElement>lis=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
				int columns=lis.size();
				System.out.println(columns);
				
				//sum of all prices

				
//				int sum=0;
//				for(int r=2;r<=rows;r++) {
//					String total_price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
//					int prize=Integer.parseInt(total_price);
//					sum+=prize;
//					
//					
//				}
//				
//				System.out.println(sum);
				
				//fetching all rows and column values
				
				//for(int r=2;r<=rows;r++) {
//					for(int c=1;c<=columns;c++) {
//						String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//						 
//						 System.out.print(price +" ");
//						
//					}
//					System.out.println();
//					
//				}
				
				//fetch the books written by mukesh;
				
				for(int r=2;r<=rows;r++) {
					String a=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
					if(a.equals("Mukesh")) {
						String ab=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
						System.out.println(ab);
					}
				}
				
				
				
				
				
				

			}

		

	}


