package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterisation {


	@Parameters({"t"})
	@Test
	public void test(String t)
	{
		System.out.println("value="+t);
	}

}
