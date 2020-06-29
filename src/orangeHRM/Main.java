package orangeHRM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	static String url = "https://opensource-demo.orangehrmlive.com/";
	static WebDriver driver;
	
	static String usernameLogin = "Admin";
	static String paswordLogin = "admin123";
	static String employeeName = "deepali";
	static String usernameRegister = "Admin@";
	static String paswordRegister = "admin123";
	static String confirmPaswordRegister = "admin123";

	
	public static void initilize() {
		System.setProperty("webdriver.chrome.driver", "E:\\deepacorejavawork\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
	
		
		initilize();
		
		LoginUser l = new LoginUser(driver);
		l.login(usernameLogin, paswordLogin);
		
		RegisterUser r = new RegisterUser();
		r.register(driver, employeeName, usernameRegister, paswordRegister, confirmPaswordRegister);
	
		//r.login();
		
    	/*RegisterUser regi = new RegisterUser();
		((LoginUser)regi).login();
		((RegisterUser)regi).register();
		*/
	}
		
	
	}


