package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.ResponseCodec;

public class Responsecode {
	String link="https://www.facebook.com";
	
	@Test
	public void test()
	{
		try {
			URL ob=new URL(link);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			
		}
		catch(Exception e)
		{
			System.out.println("null");
		}
	}

	private void ResponseCode() {
		// TODO Auto-generated method stub
		
	}
	
	

}
