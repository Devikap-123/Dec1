package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgm {
	ChromeDriver d;
	String url="http://www.amazon.in";
	
	@BeforeTest
	public void begin()
	{
		d= new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		
		
	}
	@Test
	public void run() throws InterruptedException
	{
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		String title=d.getTitle();
		System.out.println(title);
		if(title.equals("Amazon.in : Mobiles"))
		{
			System.out.println("Pass");

		}else {
			System.out.println("Fail");C:\\Users\\HP\\OneDrive\\Desktop\\datadriven.xlsx 

		}
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div")).click();
		String Parentwindow=d.getWindowHandle();
		
		
		Set<String> allWindowhandles = d.getWindowHandles();
		
		for(String handle : allWindowhandles)
		{
			if(!handle.equalsIgnoreCase(Parentwindow))
			{
				d.switchTo().window(handle);
				Thread.sleep(2500);
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				JavascriptExecutor js = (JavascriptExecutor) d;
			    js.executeScript("window.scrollBy(0, 500)");
				d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				//d.close();
				
			}
		}
		//d.switchTo().window(Parentwindow);
		
	

	}
}