package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbaySearchResultsPage {
	
	private WebDriver driver;
	
	private By titleSpanRelativeToItem = By.xpath(".//span");
	private By listItemEntryLocations = By.xpath("//h3[contains(@class, 's-item__title')]");
	
	public EbaySearchResultsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public String retrieveFirstListItemEntryTitleText() {
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(1);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
	}
	
	public String retrieveSecondListItemEntryTitleText() {
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(2);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
		
		
	}
	
	public String retrieveThirdListItemEntryTitleText() {
		
		
		WebElement listItem = this.driver.findElements(listItemEntryLocations).get(3);
		
		String title = listItem.getAttribute("innerText");
		
		return title;
	}
	
	

}
