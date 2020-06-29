import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\SeleniumDemo\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=mm#inbox");
		driver.manage().window().maximize();
	}

}
