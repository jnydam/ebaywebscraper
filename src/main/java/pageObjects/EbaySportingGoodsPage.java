package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The EbaySportingGoodsPage class which represents the
 * Sporting Goods Page which is the page which pops up after the "Sporting Goods"
 * tab link is clicked on the Ebay Home Page
 * 
 * @author johnnydam
 *
 */
public class EbaySportingGoodsPage {
	
	private WebDriver driver;
	
	private By sportCategoryLinkLocations = By.xpath("//div[contains(@class, 'grid')] //a");
	private By teamSportsLabelLocation = By.xpath("//div[contains(text(), 'Team Sports')]");
	
	/**
	 * The EbaySportingGoodsPage() constructor which takes in an instance of the 
	 * @param driver
	 */
	public EbaySportingGoodsPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	/**
	 * The retrieveSportCategoryCount() method which retrieves the number of categories
	 * that are present on the sporting goods page.
	 * 
	 * @return -- an integer which represents the number of categories which are present
	 * on the sporting goods page.
	 */
	public int retrieveSportCategoryCount() {
		
		List elements = this.driver.findElements(sportCategoryLinkLocations);
		
		return (elements.size());
		
	}
	
	/**
	 * The clickTeamSportsLabelElement() method which clicks on the team sports label
	 * (category) located on the ebay sporting goods page.
	 * 
	 * @return -- an instance of the Ebay Team Sports Page since clicking on the team sports label
	 * element will always redirect to the ebay team sports page.
	 * 
	 */
	public EbayTeamSportsPage clickTeamSportsLabelElement() {
		
		
		this.driver.findElement(teamSportsLabelLocation).click();
		
		return new EbayTeamSportsPage(this.driver);
	}
	
	
	
	

}
