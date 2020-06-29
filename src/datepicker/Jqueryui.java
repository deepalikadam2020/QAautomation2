package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jqueryui {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	
		WebElement datepickerBtn = driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/datepicker/\"]"));
		datepickerBtn.click();
	
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("March"))        
		{
			System.out.println("in loop");
			
			driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		System.out.println("out of loop");
		
		//findElements is below 
		List<WebElement> ls = driver.findElements(By.cssSelector("td[data-handler=\'selectDay\']"));
		
		int count = ls.size();
		System.out.println("total no. of days"+count);
		
		for(int i=0; i < count; i++)
		{
		String dayValue=driver.findElements(By.cssSelector("td[data-handler=\'selectDay\']")).get(i).getText();
		if(dayValue.equalsIgnoreCase("10"))
		{
			driver.findElements(By.cssSelector("td[data-handler=\'selectDay\']")).get(i).click();
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
