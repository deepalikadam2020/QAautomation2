package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
  @Test
  public void f() 
  {
	  System.out.println(" First Test");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Afetr class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After suite");
  }

}
