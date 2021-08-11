package utilityClasses;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * The Base class which acts as the parent class that
 * all of the test cases will inherit off of. 
 * 
 * This is because each test case will use the initializeDriver() method to 
 * configure the Chrome web driver instance before the test case starts up.
 * 
 * @author johnnydam
 *
 */
public class Base {
	
	public WebDriver driver;
	
	
	/**
	 * The initializeDriver() method which returns a WebDriver instance that 
	 * will be used for a specific test case
	 * 
	 * @return -- a WebDriver object which will be used for the associated test case.
	 */
	public WebDriver initializeDriver() {
		
		
		
		String basePath = System.getProperty("user.dir");
		
		System.out.println(basePath);
		
		System.setProperty("webdriver.chrome.driver", basePath + "/chromedriver");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		this.driver = new ChromeDriver(chromeOptions);
		
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().window().setSize(new Dimension(1400, 900));
		
		return driver;
		
	}

}
