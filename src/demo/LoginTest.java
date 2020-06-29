package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//LOCATORS
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("E:\\deepacorejavawork\\html\\index.html");
		
		driver.manage().window().maximize();

	//ID for username
		WebElement username=driver.findElement(By.id("uid"));
		username.sendKeys("amit");
		
	//Name for password
		driver.findElement(By.name("pass")).sendKeys("cjc2");
		
	//Tag attribute for select or drop down box
		WebElement sel= driver.findElement(By.tagName("select"));
		
		//to select the option from dropdown box CREATE SELECT CLASS OBJECT
		Select s= new Select(sel);
		s.selectByValue("ie");
		
		//check any option is selected or not remember me
		Boolean f=driver.findElement(By.id("remem")).isSelected();
		System.out.println(f);
		
	//ClassName for login button
		//driver.findElement(By.className("Login")).click();

		Thread.sleep(3000);
		//driver.switchTo().alert().accept();//to accept the popup window
	
	//Link test
		driver.findElement(By.linkText("Password?")).click();
		

	
		
		
	}

}
