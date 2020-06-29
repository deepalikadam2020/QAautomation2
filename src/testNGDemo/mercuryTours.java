package testNGDemo;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mercuryTours 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("under before suite");
		
	   	System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("successfully open browser");

	}
	
	@BeforeTest
	public void enterURL()
	{
		System.out.println("under BeforeTest");
		
		driver.get("http://newtours.demoaut.com/");
	}
	
	
	@BeforeClass
	public void maximizeWindow()
	{
		System.out.println("under BeforeClass");
		
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void getCookies()
	{
		System.out.println("under Before Method");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for (Cookie cookie : cookies) 
		{
			System.out.println(cookie.getName());			
		}
	}
	
	
	@Test(dataProvider = "getdata")
	public void loginWithUserName(String un, String ps)
	{
		System.out.println("login with valid user name");
		
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(un);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(ps);
		
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	
		System.out.println("successfilly login");
	}
	
	@AfterMethod
	public void getScreenshot() throws IOException
	{
		System.out.println("under After method");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\deepacorejavawork\\screenshotCapture\\mercury.png"));
		
		System.out.println("successfully capture screenshot");
	}
	
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("under After class");
		
		driver.manage().deleteAllCookies();
	}
	
	
	@AfterTest
	public void dbConnectionClose() 
	{
		System.out.println("under after test");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("under after suite");
		driver.close();
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		return new Object[][]
				{
					new Object[] {"cjc" , "cjc@12"},
				};
	}
 
}
