package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {

	void register(WebDriver driver, String employeeName, String usernameRegister, String paswordRegister, String confirmPaswordRegister )
	{
		
		WebElement userRoleDropdown = driver.findElement(By.cssSelector("select#systemUser_userType"));
		Select userRoleOption = new Select(userRoleDropdown);
		userRoleOption.selectByValue("1");
		
		WebElement empName = driver.findElement(By.name("systemUser[employeeName][empName]"));
		empName.sendKeys(employeeName);
	
		WebElement userName = driver.findElement(By.name("systemUser[userName]"));
		userName.sendKeys(usernameRegister);
	
		WebElement statusDropdown = driver.findElement(By.cssSelector("select#systemUser_status"));
		Select statusOption = new Select(statusDropdown);
		statusOption.selectByValue("1");
		
		WebElement passwordTextbox = driver.findElement(By.cssSelector("input#systemUser_password"));
		passwordTextbox.sendKeys(paswordRegister);

		WebElement confirmPasswordTextbox = driver.findElement(By.cssSelector("input#systemUser_confirmPassword"));
		confirmPasswordTextbox.sendKeys(confirmPaswordRegister);

		WebElement saveBtn = driver.findElement(By.id("btnSave"));
		saveBtn.click();
	
	}
	
	

}
