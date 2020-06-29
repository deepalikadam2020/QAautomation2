package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssIndex {

	static String url = "E:\\deepacorejavawork\\html\\index.html";
	static WebDriver driver;

	CssIndex() {
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void main(String[] args) {

		CssIndex indexObject = new CssIndex();
		loginPage();
	}

	static void loginPage() {
		WebElement userNameTextbox = driver.findElement(By.cssSelector("input#uid"));
		userNameTextbox.sendKeys("deepa");

		WebElement passwordTextbox = driver.findElement(By.cssSelector("input.pass"));
		passwordTextbox.sendKeys("123");

		WebElement browserDropdown = driver.findElement(By.cssSelector("select[id=browser]"));
		Select browserOptions = new Select(browserDropdown);
		browserOptions.selectByIndex(2);

		WebElement loginBtn = driver.findElement(By.cssSelector("button.login"));
		loginBtn.click();
		

	}

}
