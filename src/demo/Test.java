package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		
		System.out.println("success");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		WebElement userNameTextbox = driver.findElement(By.id("txtUsername"));
		userNameTextbox.sendKeys("Admin");
	
		WebElement password= driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement adminBtn = driver.findElement(By.id("menu_admin_viewAdminModule"));
		adminBtn.click();
		
		WebElement addBtn = driver.findElement(By.id("btnAdd"));
		addBtn.click();
		
		WebElement userRoleDropdown = driver.findElement(By.cssSelector("select#systemUser_userType"));
		Select userRoleOption = new Select(userRoleDropdown);
		userRoleOption.selectByValue("1");
		
		WebElement empName = driver.findElement(By.name("systemUser[employeeName][empName]"));
		empName.sendKeys("deepa");
	
		WebElement userName = driver.findElement(By.name("systemUser[userName]"));
		userName.sendKeys("Admin@");
	
		WebElement statusDropdown = driver.findElement(By.cssSelector("select#systemUser_status"));
		Select statusOption = new Select(statusDropdown);
		statusOption.selectByValue("1");
		
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input#systemUser_password"));
		passwordTextbox.sendKeys("Deepa@123");

		WebElement confirmPasswordTextbox = driver.findElement(By.cssSelector("input#systemUser_confirmPassword"));
		confirmPasswordTextbox.sendKeys("Deepa@123");

		WebElement saveBtn = driver.findElement(By.id("btnSave"));
		saveBtn.click();
		
	}

}
