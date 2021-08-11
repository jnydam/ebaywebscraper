package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilityClasses.ElementHelper;

/**
 * The EbayHomePage class which represents the Ebay Home Page
 * of the Ebay site. 
 * 
 * @author johnnydam
 *
 */
public class EbayHomePage {

	private WebDriver driver;
	
	
	private By searchInputLocation = By.xpath("//input[@placeholder='Search for anything']");
	private By motorsLinkLocation = By.xpath("//li //a[contains(text(), 'Motors')]");
	private By fashionLinkLocation = By.xpath("//li //a[contains(text(), 'Fashion')]");
	private By electronicsLinkLocation = By.xpath("//li //a[contains(text(), 'Electronics')]");
	
	private By sportingGoodsLinkLocation = By.xpath("//li //a[contains(text(), 'Sporting Goods')]");
	
	private By searchSubmitButtonLocation = By.xpath("//input[@type='submit']");
	
	/**
	 * The EbayHomePage() constructor which takes in a WebDriver instance
	 * from the associated test case and creates a new instance of the EbayHomePage
	 * class
	 * 
	 * @param driver -- a WebDriver instance which represetns the driver
	 * that is used for the associated test case
	 */
	public EbayHomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	/**
	 * The clickSportinGoodsLinkElement() method which clicks on the "Sporting Goods" link
	 * tab at the top of the Ebay Home Page
	 * 
	 * @return -- an instance of the EbaySportingGoodsPage class since clicking
	 * on the sporting goods link tab will always redirect to the Sporting Goods Page
	 */
	public EbaySportingGoodsPage clickSportingGoodsLinkElement() {
		
		this.driver.findElement(sportingGoodsLinkLocation).click();
		
		return new EbaySportingGoodsPage(this.driver);
	}
	
	/**
	 * The clickSearchButtonElement() method which clicks on the search button element
	 * located on the Ebay Home Page
	 * 
	 * @return -- an instance of the EbaySearchResultsPage class since clicking
	 * on the search button element will always redirect to the ebay search results page
	 */
	public EbaySearchResultsPage clickSearchButtonElement() {
		
		this.driver.findElement(searchSubmitButtonLocation).click();
		
		return new EbaySearchResultsPage(this.driver);
	}
	
	/**
	 * The clickableMotorsLinkElement() method which checks whether the motors
	 * link tab is clickable on the Ebay Home Page
	 * 
	 * @return -- a boolean which represents whether the motors link tab
	 * is clickable on the Ebay Home Page
	 */
	public boolean clickableMotorsLinkElement() {
		
		return ElementHelper.elementClickable(motorsLinkLocation, this.driver);
	}
	
	/**
	 * The clickableFashionLinkElement() method which checks whether the fashion link
	 * tab is clickable on the Ebay Home Page
	 * 
	 * @return -- a boolean which represents whether the fashion link tab
	 * is clickable on the Ebay Home Page
	 */
	public boolean clickableFashionLinkElement() {
		
		return ElementHelper.elementClickable(fashionLinkLocation, this.driver);
		
	}
	/**
	 * The clickableElectronicsLinkElement() method which checks whether the electronics
	 * link tab is clickable o the Ebay Home Page
	 * @return
	 */
	public boolean clickableElectronicsLinkElement() {
		
		return ElementHelper.elementClickable(electronicsLinkLocation, this.driver);
		
	}
	
	/**
	 * The presentSearchInputElement() method which checks whether the search input element
	 * method is present on the screen. 
	 * 
	 * @return -- a boolean which represents whether the search input
	 * element method is present on the screen.
	 * 
	 */
	public boolean presentSearchInputElement() {
		
		return ElementHelper.elementPresent(searchInputLocation, this.driver);
	}
	
	public void textInputSearchInputElement(String data) {
		
		this.driver.findElement(searchInputLocation).sendKeys(data);
		
	}
	
	
}
