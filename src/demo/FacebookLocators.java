package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Id for firstname
		WebElement name= driver.findElement(By.id("u_0_m"));
		name.sendKeys("deepa");
		
		//Name for surname
		WebElement lastname= driver.findElement(By.name("lastname"));
		lastname.sendKeys("kadam");
			
		//ClassName for mobile number
		WebElement number= driver.findElement(By.name("reg_email__"));
		number.sendKeys("8149205727");
		
		//name for password
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("cjc123");
		
		WebElement sel= driver.findElement(By.name("birthday_day"));
		Select s= new Select(sel);
		s.selectByValue("10");
		
		WebElement sel1= driver.findElement(By.name("birthday_month"));
		Select s1= new Select(sel1);
		s1.selectByValue("7");

		WebElement sel2= driver.findElement(By.name("birthday_year"));
		Select s2= new Select(sel2);
		s2.selectByValue("2010");
		
		WebElement femaleRadioBtn = driver.findElement(By.id("u_0_6"));
		boolean f=femaleRadioBtn.isSelected();
		if(f==false) {
			femaleRadioBtn.click();
		}
		System.out.println(f);
		 	 	
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		
		
		
		
		
	}

}
