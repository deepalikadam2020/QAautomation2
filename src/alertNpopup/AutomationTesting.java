package alertNpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//css : tagname.classname[@attribute=value]
		WebElement switchToDropdown = driver.findElement(By.cssSelector("a.dropdown-toggle[href=\"SwitchTo.html\"]"));
		switchToDropdown.click();	
		
		//relative xpath: //tagname[@attribute=value]
		WebElement alertBtn =driver.findElement(By.xpath("//a[@href=\"Alerts.html\"]"));
		alertBtn.click();
		
		//contans xpath: //tagname[contains(@attribute,value)]
		WebElement alertWithOKBtn = driver.findElement(By.xpath("//a[contains(@href,\"#OKTab\")]"));
		alertWithOKBtn.click();
		
		//contans xpath: //tagname[contains(@attribute,value]
		WebElement displayAlertBoxBtn = driver.findElement(By.xpath("//button[contains(@onclick,\"alertbox()\")]"));
		displayAlertBoxBtn.click();
		
		
		//ACCEPTING alert with accept() method
		Alert ok = driver.switchTo().alert();
		ok.accept();
		
		//contans xpath: //tagname[contains(@attribute,value]
		WebElement alertWithOKnCancelBtn = driver.findElement(By.xpath("//a[contains(@href,\"#CancelTab\")]"));
		alertWithOKnCancelBtn.click();
		
		//contans xpath: //tagname[contains(text(),"value")]
		WebElement displayConfirmBoxBtn = driver.findElement(By.xpath("//button[contains(text(),\"click the button to display a confirm box \")] "));
		displayConfirmBoxBtn.click();
		
		//CANCEL alert with dismiss() method: click on cancel btn
		driver.switchTo().alert().dismiss();
		
		//relative xpath: //tagname[@attribute=value]
		WebElement alertWithTextBox = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
		alertWithTextBox.click();
		
		//relative xpath: //tagname[@attribute=value]
		WebElement clickPromptBox = driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
		clickPromptBox.click();
		
		driver.switchTo().alert().sendKeys("deepali");
		driver.switchTo().alert().accept();
	
		
	
	}
}
