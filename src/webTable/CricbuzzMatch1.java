package webTable;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzzMatch1 {

	//https://rahulshettyacademy.com/AutomationPractice/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.xpath("//div[@id=\"innings_1\"]/child::div[1]"));
		
		//total count
		List<WebElement> ls = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int count = ls.size();
		System.out.println("count"+count);
		
		//run
		List<WebElement> ls1 = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
		int count1 = ls1.size();
		System.out.println("total no of elements"+count1);
		
		//total run
		int sum= 0;
		for(int i=0; i < count1-2; i++)
		{
			String val = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			
			int valrun = Integer.parseInt(val);
			
			sum=sum+valrun;
			System.out.println(sum);
			
		}
		System.out.println("total run "+sum);
		
		//for extra run
		String eval = table.findElement(By.xpath("//div[text()='Extras']/following-sibling :: div")).getText();
		int extraValue = Integer.parseInt(eval);
		System.out.println("extra run "+extraValue);
		
		int totalrun = sum+extraValue;
		System.out.println("total run "+totalrun);
		
		String tval = table.findElement(By.xpath("//div[text()='Total']/following-sibling :: div")).getText();
		int tvalue = Integer.parseInt(tval);
		
		System.out.println("total final run"+tvalue);
		
		if(tvalue==totalrun)
		{
			System.out.println("score is mathched");
		}
		else 
		{
			System.out.println("scored is not matched");
		}
		
		
	}

}
