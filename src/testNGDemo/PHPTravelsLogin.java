 package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PHPTravelsLogin {
  
	static WebDriver driver;
	
  @Test
  public void logincheck() 
  {
	  WebElement firstNameTextbox = driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
		firstNameTextbox.sendKeys("deepali");

		WebElement lastNameTextbox = driver.findElement(By.cssSelector("input[name=\"lastname\"]"));
		lastNameTextbox.sendKeys("kadam");
		
		WebElement mobileNumberTextbox = driver.findElement(By.cssSelector("input[name=\"phone\"]"));
		mobileNumberTextbox.sendKeys("1234567");
		
		WebElement emailTextbox = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		emailTextbox.sendKeys("deepali@gmail.com");
		
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		passwordTextbox.sendKeys("1234567");
		
		WebElement confirmPasswordTextbox = driver.findElement(By.cssSelector("input[name=\"confirmpassword\"]"));
		confirmPasswordTextbox.sendKeys("1234567");
		
		WebElement signUpBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		signUpBtn.click();
		

  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() throws IOException 
  {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("E:\\deepacorejavawork\\screenshotCapture\\php.png"));
		
		System.out.println("successfulyy captured screenshot");
		
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest()
  {
	  driver.get("https://www.phptravels.net/register");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() 
  {
    	System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		driver = new ChromeDriver();

  }

  @AfterSuite
  public void afterSuite() {
  }

}
