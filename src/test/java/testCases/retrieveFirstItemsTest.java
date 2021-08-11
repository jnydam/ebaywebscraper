package testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.EbayHomePage;
import pageObjects.EbaySearchResultsPage;
import utilityClasses.Base;

public class retrieveFirstItemsTest extends Base {
	
	
	private WebDriver driver;
	
	@BeforeClass
	public void preClass() {
		
		this.driver = initializeDriver();
	}
	
	
	/**
	 * Test Description: 
	 * 
	 * This test navigates to the Ebay Home Page,
	 * types in "computers" into the main search box element, and then
	 * prints out the titles of the first 3 items that are listed on the page.
	 * 
	 * 
	 */
	@Test
	public void retrieveFirstItemsTest() throws InterruptedException {
		
		System.out.println("Test is starting");
		
		this.driver.get("https://www.ebay.com/");
		System.out.println("Loaded the ebay home page");
		
		EbayHomePage ebayHomePage = new EbayHomePage(this.driver);
		
		ebayHomePage.textInputSearchInputElement("computers");
		
		EbaySearchResultsPage searchResultsPage = ebayHomePage.clickSearchButtonElement();
		
		System.out.println(searchResultsPage.retrieveFirstListItemEntryTitleText());
		System.out.println(searchResultsPage.retrieveSecondListItemEntryTitleText());
		System.out.println(searchResultsPage.retrieveThirdListItemEntryTitleText());
		
		
	    
		
	}
	
	
	@AfterClass
	public void postClass() {
		
		this.driver.close();
	}
	
}
