package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The EbayTeamSportsPage class which represents the 
 * Ebay Team Sports Page which pops up after the "Team Sports" label
 * element is clicked on the ebay sporting goods page.
 * 
 * @author johnnydam
 *
 */
public class EbayTeamSportsPage {
	
	private WebDriver driver;
	
	private By listingsSectionItemLocations = By.xpath("//section[contains(@class, 'listings')] //a[contains(@class, 'b-tile')]");
	private By priceLocationRelativeToItem = By.xpath(".//div[contains(@class, 'price')] //span");
	
	/**
	 * The EbayTeamSportsPage() constructor which takes in 
	 * an instance of the WebDriver from the specified test case
	 * and then creates an instance of the EbayTeamSportsPage object
	 * 
	 * @param driver -- an instance of a WebDriver object
	 */
	public EbayTeamSportsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	/**
	 * The retrievePricesOnPage() method which retrieves all of the prices
	 * of the items that are currently on the page and then returns them in a string
	 * array
	 * 
	 * @return -- a string array which represents all the prices that are retrieved
	 * from the ebay team sports page.
	 */
	public String[] retrievePricesOnPage() {
		
		
		
		List<WebElement> elements = this.driver.findElements(listingsSectionItemLocations);
		String[] pricesArray = new String[elements.size()];
		
		for (int i = 0; i < elements.size(); i++) {
			
			WebElement element = elements.get(i);
			
			String price = element.findElement(priceLocationRelativeToItem).getAttribute("innerText");
			
			pricesArray[i] = price;
			
			
			
		}
		
		return pricesArray;
		
	}
	
	

}
