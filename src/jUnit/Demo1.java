package jUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo1 {

	@Before
	public void m1()
	{
		System.out.println("@ before");
	}
	
	@After
	public void m2()
	{
		System.out.println("@ after");
	}
	
	@BeforeClass
	//static method
	public static void m3()
	{
		System.out.println("@before class");
	}
	
	@AfterClass
	public static void m4()
	{
		System.out.println("@ after class");
	}
	
	@Test
	public void m5()
	{
		System.out.println("test 1");
	}
	
	@Test
	public void m6()
	{
		System.out.println("test 2");
	}
	
	@Test(timeout = 1000)
	public void m7()
	{
		System.out.println("test 3");
	}
	

	}

