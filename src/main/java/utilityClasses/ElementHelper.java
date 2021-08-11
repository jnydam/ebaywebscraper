package utilityClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The ElementHelper class which contains helper
 * static methods for checking if a method is either present or clickable
 * on the page. 
 * 
 * @author johnnydam
 *
 */
public class ElementHelper {
	
	
	/**
	 * The elementClickable() method which takes in a By locator object
	 * and the instance of the WebDriver and checks if the associated WebElement
	 * is clickable
	 *  
	 * @param locator -- a By object which represents the location of the WebElement that is being
	 * checked
	 * 
	 * @param driver -- an instance of the WebDriver object used in the test case
	 * 
	 * @return -- a boolean which represents whether the element is clickable.
	 */
	public static boolean elementClickable(By locator, WebDriver driver) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		
		try {
			
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		} catch (Exception e) {
			
			return false;
		}
		
		return true;
	}
	
	/**
	 * The elementPresent() method which takes in a By locator object
	 * and the instance of the WebDriver and checks if the associated WebElement
	 * is present. 
	 * 
	 * @param locator -- a By object which represents the location of the WebElement that is being
	 * checked
	 * 
	 * @param driver -- an instance of the WebDriver object used in the test case
	 * 
	 * 
	 * @return -- a boolean which represents whether the element is present.
	 */
	public static boolean elementPresent(By locator, WebDriver driver) {
		
		
		List<WebElement> elementList = driver.findElements(locator);
		
		return (elementList.size() != 0);
	}

}
