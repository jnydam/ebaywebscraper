package testCases;

import java.util.Arrays;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.EbayHomePage;
import pageObjects.EbaySportingGoodsPage;
import pageObjects.EbayTeamSportsPage;
import utilityClasses.Base;

public class pricesTeamSportGoodsFirstPageTest extends Base {
	
	
	private WebDriver driver;
	
	@BeforeClass
	public void preClass() {
		
		this.driver = initializeDriver();
	}
	
	
	/**
	 * Test Description: 
	 * 
	 * This test navigates to the Ebay Home Page, clicks on the sporting goods link, 
	 * then first prints out the number of categories present on the sporting goods page,
	 * then clicks on the team sports category.
	 * 
	 * Once in the team sports page, the driver then prints out all the prices of the items
	 * that are listed on the page (excluding the carousel deals)
	 */
	@Test
	public void pricesTeamSportsGoodsFirstPageTest() throws InterruptedException {
		
		System.out.println("Test is starting");
		
		this.driver.get("https://www.ebay.com/");
		System.out.println("Loaded the ebay home page");
		
		EbayHomePage ebayHomePage = new EbayHomePage(this.driver);
		
		EbaySportingGoodsPage sportingGoodsPage = ebayHomePage.clickSportingGoodsLinkElement();
		
		int categories = sportingGoodsPage.retrieveSportCategoryCount();
		
		System.out.println("There are " + categories + " listed on the sports category page");
		
		EbayTeamSportsPage teamSportsPage = sportingGoodsPage.clickTeamSportsLabelElement();
		
		String[] priceArray = teamSportsPage.retrievePricesOnPage();
		
		System.out.println("The prices listed on the team sports page are:");
		System.out.println(Arrays.toString(priceArray));
		
		
		System.out.println("Test is ending");
		
	}
	
	
	@AfterClass
	public void postClass() {
		
		this.driver.close();
	}
	
}
