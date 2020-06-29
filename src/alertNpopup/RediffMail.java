package alertNpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement signInBtn = driver.findElement(By.xpath("//input[@value=\"Sign in\"]"));
		signInBtn.click();	
		
		driver.switchTo().alert().accept();
		
		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id=\"login1\"]"));
		usernameTextBox.sendKeys("deepali");
		
		WebElement signInBtn1 = driver.findElement(By.xpath("//input[@value=\"Sign in\"]"));
		signInBtn1.click();
		
		driver.switchTo().alert().accept();
		
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordTextBox.sendKeys("123456");
		
		WebElement signInBtn2 = driver.findElement(By.xpath("//input[@value=\"Sign in\"]"));
		signInBtn2.click();
		
		
		
		
		
	
		
	}

}
