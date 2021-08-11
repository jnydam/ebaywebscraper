package testCases;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.EbayHomePage;
import utilityClasses.Base;

public class verifyEbayHomePageTest extends Base {
	
	
	private WebDriver driver;
	
	@BeforeClass
	public void preClass() {
		
		this.driver = initializeDriver();
	}
	
	
	/**
	 * Test Description: 
	 * 
	 * This test navigates to the Ebay Home Page, 
	 * and just verifies that the motors, electronics, and fashion
	 * link tabs are clickable on the page (present).
	 * 
	 * It also verifies that the search input element on the home page
	 * is also present as well. 
	 * 
	 */
	@Test
	public void verifyEbayHomePageTest() throws InterruptedException {
		
		System.out.println("Test is starting");
		
		this.driver.get("https://www.ebay.com/");
		System.out.println("Loaded the ebay home page");
		
		EbayHomePage ebayHomePage = new EbayHomePage(this.driver);
		
		Assert.assertTrue(ebayHomePage.clickableMotorsLinkElement());
		System.out.println("Verified that the motors link is present on the ebay home page");
		
		Assert.assertTrue(ebayHomePage.clickableElectronicsLinkElement());
		System.out.println("Verified that the electronics link is present on the ebay home page");
		
		Assert.assertTrue(ebayHomePage.clickableFashionLinkElement());
		System.out.println("Verified that the fashion link is present on the ebay home page");
		
		Assert.assertTrue(ebayHomePage.presentSearchInputElement());
		System.out.println("Verified that the search input element is present on the page");
		
		System.out.println("Test is ending");
		
	}
	
	
	@AfterClass
	public void postClass() {
		
		this.driver.close();
	}
	
}
