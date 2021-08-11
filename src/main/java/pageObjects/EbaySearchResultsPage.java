package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The EbaySearchResultsPage class which
 * represents the Ebay Search Results Page after something
 * is entered into the initial search input element on the home page.
 * 
 * @author johnnydam
 *
 */
public class EbaySearchResultsPage {
	
	private WebDriver driver;
	
	private By titleSpanRelativeToItem = By.xpath(".//span");
	private By listItemEntryLocations = By.xpath("//h3[contains(@class, 's-item__title')]");
	
	/**
	 * The EbaySearchResultsPage() constructor which takes an instance of a 
	 * WebDriver object and then creates an instance of the EbaySearchResultsPage object
	 * 
	 * @param driver -- an instance of the WebDriver from the specific test case
	 */
	public EbaySearchResultsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	/**
	 * The retrieveFirstListItemEntryTitleText() method which retrieves the title text
	 * of the first entry on the ebay search results page
	 * 
	 * @return -- a string which represents the title text of the first item entry on the
	 * ebay search results page
	 */
	public String retrieveFirstListItemEntryTitleText() {
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(1);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
	}
	
	/**
	 * The retrieveSecondListItemEntryTitleText() method which retrieves the title text
	 * of the second entry on the ebay search results page
	 * 
	 * @return -- a string which represents the title text of the second item
	 * entry on the ebay search results page
	 */
	public String retrieveSecondListItemEntryTitleText() {
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(2);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
		
		
	}
	
	/**
	 * The retrieveThirdListItemEntryTitleText() method which retrieves the title 
	 * text of the third item entry on the ebay search results page
	 * 
	 * @return -- a string which represents the title text of the third item
	 * entry on the ebay search results page
	 */
	public String retrieveThirdListItemEntryTitleText() {
		
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(3);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
	}
	
	

}
