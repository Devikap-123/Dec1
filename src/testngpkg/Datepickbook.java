package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickbook {
	WebDriver driver;
	String url="https://www.booking.com/";
	@BeforeTest
	public void urlopen() {
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[2]/span"));
		while(true)
		{
			{
				WebElement month= driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/h3"));
				String monthtext=month.getText();
				System.out.println(monthtext);
				if(monthtext.equals("March 2024"))
					
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/button/span/span/svg")).click();
				}
			}
			 List<WebElement> li=driver.findElements(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
			  for(WebElement ele :li)
			  {
				  String date= ele.getText();
				  if(date.equals("13"))
				  {
					  ele.click();
					  break;
				  }
	}
		}
				
	}
	
			

}
