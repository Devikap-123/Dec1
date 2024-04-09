package testngpkg;



import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver =new ChromeDriver();
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\datadriven.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int r=sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username");
			System.out.println("password");
			driver.get("https://www.facebook.com");
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			String actualurl=driver.getCurrentUrl();
			String expurl=("https://www.facebook.com");
			if(actualurl.equals(expurl))
			{
				System.out.println("Successful");
			}
			else
			{
				System.out.println("Unsuccessful");		}
	}
	
	

}
}