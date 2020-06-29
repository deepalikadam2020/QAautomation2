package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html?m=1");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		wait.until(new Function<WebDriver, WebElement>() {
		
			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				
				 WebElement msg = t.findElement(By.xpath("//p[contains(text(),\"Software Testing Material - DEMO PAGE\")]"));
				String s = msg.getText();
				
				if(s.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
				{
					return msg;
				}
				else 
				{
				return null;
				}
				
			}
		});//***
		
}
}