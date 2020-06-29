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

public class RegisterMercuryTours 
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
			
			driver.get("http://newtours.demoaut.com/mercuryregister.php");
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
		public void register() throws IOException
		{
					//load xlsx file
					FileInputStream fis = new FileInputStream("E:\\deepacorejavawork\\demo.xlsx");
					
					//Load Work Book 
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					
					XSSFSheet sheet = wb.getSheet("Sheet3");
					
					XSSFRow row = sheet.getRow(1);
					XSSFCell col = row.getCell(0);
					String firstName = col.getStringCellValue();
					System.out.println(firstName);
					
					XSSFRow row1 = sheet.getRow(1);
					XSSFCell col1 = row1.getCell(1);
					String lastName = col1.getStringCellValue();
					System.out.println(lastName);
					
					XSSFRow row2 = sheet.getRow(1);
					XSSFCell col2 = row2.getCell(2);
					String phone = col2.getStringCellValue();
					System.out.println(phone);

					XSSFRow row3 = sheet.getRow(1);
					XSSFCell col3 = row3.getCell(3);
					String email = col3.getStringCellValue();
					System.out.println(email);

					XSSFRow row4 = sheet.getRow(1);
					XSSFCell col4 = row4.getCell(4);
					String address = col4.getStringCellValue();
					System.out.println(address);

					XSSFRow row5 = sheet.getRow(1);
					XSSFCell col5 = row5.getCell(5);
					String city = col5.getStringCellValue();
					System.out.println(city);
		
					XSSFRow row6 = sheet.getRow(1);
					XSSFCell col6 = row6.getCell(6);
					String state = col6.getStringCellValue();
					System.out.println(state);
		
					XSSFRow row7 = sheet.getRow(1);
					XSSFCell col7 = row7.getCell(7);
					String code = col7.getStringCellValue();
					System.out.println(code);
					
					XSSFRow row8 = sheet.getRow(1);
					XSSFCell col8 = row8.getCell(8);
					String country = col8.getStringCellValue();
					System.out.println(country);
		
					XSSFRow row9 = sheet.getRow(1);
					XSSFCell col9 = row9.getCell(9);
					String username = col9.getStringCellValue();
					System.out.println(username);
		
					XSSFRow row10 = sheet.getRow(1);
					XSSFCell col10 = row10.getCell(10);
					String password = col10.getStringCellValue();
					System.out.println(password);

					XSSFRow row11 = sheet.getRow(1);
					XSSFCell col11 = row11.getCell(11);
					String ConfirmPassword =  col11.getStringCellValue();
					System.out.println(ConfirmPassword);

					
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys(phone);
		
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys(address);			

		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(city);
	
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys(state);
	
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys(code);
		
		driver.findElement(By.xpath("//option[@value=\"92\"]")).click();
	
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name=\"register\"]")).click();
		
		}

}
