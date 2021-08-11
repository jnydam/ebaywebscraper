package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EbayTeamSportsPage {
	
	private WebDriver driver;
	
	private By listingsSectionItemLocations = By.xpath("//section[contains(@class, 'listings')] //a[contains(@class, 'b-tile')]");
	private By priceLocationRelativeToItem = By.xpath(".//div[contains(@class, 'price')] //span");
	
	public EbayTeamSportsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
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
