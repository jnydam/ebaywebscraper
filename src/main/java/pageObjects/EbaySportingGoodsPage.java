package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbaySportingGoodsPage {
	
	private WebDriver driver;
	
	private By sportCategoryLinkLocations = By.xpath("//div[contains(@class, 'grid')] //a");
	private By teamSportsLabelLocation = By.xpath("//div[contains(text(), 'Team Sports')]");
	
	public EbaySportingGoodsPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public int retrieveSportCategoryCount() {
		
		List elements = this.driver.findElements(sportCategoryLinkLocations);
		
		return (elements.size());
		
	}
	
	public EbayTeamSportsPage clickTeamSportsLabelElement() {
		
		
		this.driver.findElement(teamSportsLabelLocation).click();
		
		return new EbayTeamSportsPage(this.driver);
	}
	
	
	
	

}
