package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssFacebokNth {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		WebElement firstNameTextbox = driver.findElement(By.cssSelector("input#u_0_m"));
		firstNameTextbox.sendKeys("deepali");
		
		WebElement lastNameTextbox = driver.findElement(By.cssSelector("input#u_0_o"));
		lastNameTextbox.sendKeys("kadam");
		
		WebElement mobileNumberTextbox = driver.findElement(By.cssSelector("div#u_0_p>div#u_0_q input:nth-of-type(1)"));
		mobileNumberTextbox.sendKeys("1234567");
		
		WebElement passwordTextbox = driver.findElement(By.cssSelector("div#password_field>div#u_0_v input:nth-of-type(1)"));
		passwordTextbox.sendKeys("1234567");
		
		WebElement dateDropdown = driver.findElement(By.cssSelector("div._5k_5>span#u_0_x select:nth-of-type(1)"));
		Select dateOptions = new Select(dateDropdown);
		dateOptions.selectByIndex(20);

		WebElement monthDropdown = driver.findElement(By.cssSelector("div._5k_5>span#u_0_x select:nth-of-type(2)"));
		Select monthOptions = new Select(monthDropdown);
		monthOptions.selectByIndex(12);
		
		WebElement yearDropdown = driver.findElement(By.cssSelector("div._5k_5>span#u_0_x select:nth-of-type(3)"));
		Select yearOptions = new Select(yearDropdown);
		yearOptions.selectByValue("2000");


		WebElement femaleBtn = driver.findElement(By.cssSelector("input#u_0_6"));
		femaleBtn.click();
		
		WebElement signUpBtn = driver.findElement(By.cssSelector("div#reg_form_box>div._1lch button:nth-of-type(1)"));
		signUpBtn.click();

	}

}
