package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path2usa {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		WebElement cityNameTextBox = driver.findElement(By.xpath("//input[@id=\"travel_from\"]"));
		cityNameTextBox.sendKeys("pune");
		
		WebElement dateOfTravel = driver.findElement(By.xpath("//input[@id=\"travel_date\"]"));
		dateOfTravel.click();
		
		while(! driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("July 2020"));
		{
			System.out.println("in loop");
			
			driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
		}
		System.out.println("out of loop");
		
	
	
	}

}
