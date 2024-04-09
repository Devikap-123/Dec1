package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbloginPage;

public class Fblogintest extends Baseclass {
	
	//WebDriver driver;
	
	 @Test(priority = 1)
	 
	 public void testLogin() throws InterruptedException
	 {
		 FbloginPage obj = new FbloginPage(driver);
		 
		 //System.out.println(driver);
		 
		 obj.setValues("abcd@gmail.com", "abc123@");
		 
		 obj.loginClick();
		 
		 Thread.sleep(1000);
		 
		 driver.navigate().back();
	 }}