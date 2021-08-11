package utilityClasses;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	
	
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
