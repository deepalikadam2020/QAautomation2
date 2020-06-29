package testNGAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	@Test
	public void test1()
	{
		System.out.println("1");
		
		Assert.assertEquals(10, 10);
		System.out.println("2");
		
		Assert.assertEquals(true, true);
		System.out.println("3");
		
		Assert.assertEquals("CJC", "CJCKN");
		System.out.println("4");
		
		Assert.assertEquals(20, 20);
		System.out.println("5");
	}
	
	@Test
	public void test2()
	{
		System.out.println("6");
		Assert.assertEquals(10, 10);
		System.out.println("7");
		Assert.assertEquals(true, true);
		System.out.println("8");
		Assert.assertEquals("CJC", "CJC");
		System.out.println("9");
		Assert.assertEquals(20, 20);
		System.out.println("10");
	}


}
