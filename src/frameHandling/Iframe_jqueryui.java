package frameHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_jqueryui {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement droppableBtn =  driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/droppable/\"]"));
		droppableBtn.click();
		
		List<WebElement> ls = driver.findElements(By.tagName("iframe"));
		int count = ls.size();
		System.out.println(count);
		
		//frameIn concept
		driver.switchTo().frame(0);
		
		WebElement dragMeToTarget = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement dropHere = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions action = new Actions(driver);
		
		
		action.dragAndDrop(dragMeToTarget, dropHere).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About")).click();
		
		
	}

}
