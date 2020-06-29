package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement firstNameTextbox = driver.findElement(By.cssSelector("input#u_0_m"));
		firstNameTextbox.sendKeys("deepali");
		
		WebElement lastNameTextbox = driver.findElement(By.cssSelector("input#u_0_o"));
		lastNameTextbox.sendKeys("kadam");
		
		WebElement mobileNumberTextbox = driver.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]"));
		mobileNumberTextbox.sendKeys("1234567");
		
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input[aria-label=\"New password\"]"));
		passwordTextbox.sendKeys("1234567");
		
		WebElement dateDropdown = driver.findElement(By.cssSelector("select[name=\"birthday_day\"]"));
		Select dateOptions = new Select(dateDropdown);
		dateOptions.selectByIndex(20);

		WebElement monthDropdown = driver.findElement(By.cssSelector("select[name=\"birthday_month\"]"));
		Select monthOptions = new Select(monthDropdown);
		monthOptions.selectByIndex(12);
		
		WebElement yearDropdown = driver.findElement(By.cssSelector("select[name=\"birthday_year\"]"));
		Select yearOptions = new Select(yearDropdown);
		yearOptions.selectByValue("2000");


		WebElement femaleBtn = driver.findElement(By.cssSelector("input#u_0_6"));
		femaleBtn.click();
		
		WebElement signUpBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		signUpBtn.click();
		
		//driver.close();
		
		
		
		

		
		
	}

}
