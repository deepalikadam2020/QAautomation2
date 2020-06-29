package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		
		System.out.println("success");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		System.out.println(title+"title");
		
		System.out.println(driver.getCurrentUrl());
		
		/*//page source
		String sourcecode= driver.getPageSource();
		System.out.println(sourcecode);
		*/
		
		//window handle
		String key= driver.getWindowHandle();
		System.out.println(key);
		
		//navigate 
		driver.navigate().to("https://www.facebook.com/");
		String title1= driver.getTitle();
		System.out.println(title1+"title");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		//driver.quit();
		
	}

}
