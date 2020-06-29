package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPHP {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/register");
		driver.manage().window().maximize();

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

}
