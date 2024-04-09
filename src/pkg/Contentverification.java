package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contentverification {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("contain gamil text");
		}
		else
		{
			System.out.println("not contain");
		}

	}

}
