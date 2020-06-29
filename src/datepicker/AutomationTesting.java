package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();

		WebElement skipSignInBtn = driver.findElement(By.xpath("//button[@id=\"btn2\"]"));
		skipSignInBtn.click();
		
		WebElement widgetBtn = driver.findElement(By.xpath("//a[@href=\"Widgets.html\"]"));
		widgetBtn.click();
		
		WebElement datepickerBtn = driver.findElement(By.xpath("//a[@href=\"Datepicker.html\"]"));
		datepickerBtn.click();
		
		WebElement datepickerDisableBtn = driver.findElement(By.id("datepicker1"));
		datepickerDisableBtn.click();
		
		while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("November"))
		{
			System.out.println("in loop");
			
			driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-next ui-corner-all']")).click();
		}
		System.out.println("out loopp");
		

		
		System.out.println("hello git");
		
	}

}
