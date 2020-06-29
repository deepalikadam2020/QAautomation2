package testNGAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void test1()
	{
	SoftAssert sa = new SoftAssert();
	
	System.out.println("1");
	
	sa.assertEquals(10, 10);
	System.out.println("2");
	
	sa.assertEquals(true, true);
	System.out.println("3");
	
	sa.assertEquals("cjc", "cjckn");
	System.out.println("4");
	
	sa.assertEquals(50, 56);
	System.out.println(5);
	
	sa.assertAll();
	
	}
	
}
