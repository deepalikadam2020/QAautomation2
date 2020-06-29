package excelPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginMercuryTours 
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
	
	
	@Test
	public void loginWithUserName() throws IOException
	{
				//load xlsx file
				FileInputStream fis = new FileInputStream("E:\\deepacorejavawork\\demo.xlsx");
				
				//Load Work Book 
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sheet = wb.getSheet("Sheet2");
				
				XSSFRow row = sheet.getRow(1);
				XSSFCell col = row.getCell(0);
				String username = col.getStringCellValue();
				System.out.println(username);
				
				XSSFRow row1 = sheet.getRow(1);
				XSSFCell col1 = row1.getCell(1);
				String password = col1.getStringCellValue();
				System.out.println(password);
				
	
		System.out.println("login with valid user name");
		
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
	
		System.out.println("successfilly login");
	}
	
	
}
