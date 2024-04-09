package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpage {
	
	ChromeDriver driver;
	String Baseurl="file:///C:/Users/HP/OneDrive/Desktop/java/alert.html";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize(); //to maximize browser
		driver.get(Baseurl);
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		//a.dismiss(); -to cancel alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("vd");

}
}
