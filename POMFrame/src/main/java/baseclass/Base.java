package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void smbase() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver= new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://my.reviewrev.com/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//test
	}
	

}
