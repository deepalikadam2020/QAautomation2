package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\deepacorejavawork\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement langSelect = driver.findElement(By.id("icp-nav-flyout"));
		action.doubleClick(langSelect).perform();

		WebElement hindiRadioBtn = driver.findElement(By.xpath("//input[@value=\"hi_IN\"]"));
		action.click(hindiRadioBtn).perform();
		
		WebElement cancelBtn = driver.findElement(By.xpath("//a[@class=\"a-button-text\"]"));
		action.click(cancelBtn).perform();
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
		action.click(signIn).perform();
		
		WebElement mobileNoTextBox = driver.findElement(By.xpath("//input[@id='ap_email']"));
		action.sendKeys(mobileNoTextBox, "9898989").build().perform();
		
		
	}

}
