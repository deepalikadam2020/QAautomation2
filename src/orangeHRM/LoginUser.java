package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginUser{

	private WebDriver driver;

	LoginUser(WebDriver driver)
	{
		this.driver= driver;
	}

	public void login(String usernameLogin, String paswordLogin )
	{
		WebElement userNameTextbox = driver.findElement(By.id("txtUsername"));;
		userNameTextbox.sendKeys(usernameLogin);
		
		WebElement password= driver.findElement(By.id("txtPassword"));
		password.sendKeys(paswordLogin);
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
/*		WebElement adminBtn = driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule"));
		adminBtn.click();
*/	
		WebElement adminBtn = driver.findElement(By.id("menu_admin_viewAdminModule"));
		adminBtn.click();
	
		WebElement addBtn = driver.findElement(By.id("btnAdd"));
		addBtn.click();
		
	} 	 

	
}

