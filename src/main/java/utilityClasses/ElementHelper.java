package utilityClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {
	
	
	public static boolean elementClickable(By locator, WebDriver driver) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		
		try {
			
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		} catch (Exception e) {
			
			return false;
		}
		
		return true;
	}
	
	public static boolean elementPresent(By locator, WebDriver driver) {
		
		
		List<WebElement> elementList = driver.findElements(locator);
		
		return (elementList.size() != 0);
	}

}
