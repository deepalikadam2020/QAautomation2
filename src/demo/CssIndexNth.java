package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssIndexNth {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\deepacorejavawork\\html\\index.html");
		driver.manage().window().maximize();
		
		WebElement userNameTextbox = driver.findElement(By.cssSelector("input#uid"));
		userNameTextbox.sendKeys("deepa");

		WebElement passwordTextbox = driver.findElement(By.cssSelector("form#headerlogin>div.container  input:nth-of-type(2)"));
		passwordTextbox.sendKeys("123");
		
		WebElement browserDropdown = driver.findElement(By.cssSelector("form#headerlogin>div.container :nth-child(9)"));
		Select browserOptions = new Select(browserDropdown);
		browserOptions.selectByIndex(2);
		

/*		WebElement loginBtn = driver.findElement(By.cssSelector("form#headerlogin>div.container button:nth-of-type(1)"));
		loginBtn.click();
*/		
		/*WebElement cancelBtn = driver.findElement(By.cssSelector("form#headerlogin>div.imgcontainer button:nth-of-type(1)"));
		cancelBtn.click();
		*/
		WebElement forgetPassword = driver.findElement(By.cssSelector("form#headerlogin>div.imgcontainer a:nth-of-type(1)"));
		forgetPassword.click();
		

	}

}
