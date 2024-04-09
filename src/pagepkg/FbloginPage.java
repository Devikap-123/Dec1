package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbloginPage {
	
WebDriver driver;
	
	//Repository
	
	By fbEmail = By.id("email");
	
	By fbPwd = By.id("pass");
	
	By fbLogin = By.name("login");
	
	By fbCreatePage = By.xpath("//div[@id = 'reg_pages_msg']/a");
	
	By fbCreatePageSignUp = By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public FbloginPage(WebDriver driver)
	{
		this.driver = driver;
	}
			
	
	public void setValues(String email, String pwd)
	{
		driver.findElement(fbEmail).sendKeys(email);
		
		driver.findElement(fbPwd).sendKeys(pwd);
	}
	
	public void loginClick()
	{
		driver.findElement(fbLogin).click();
	}
}