package testcases;

import org.testng.annotations.Test;


import pages.WafilifeHomePage;
import utilities.BaseDriverSetup;


public class WafilifeHomePageTest extends BaseDriverSetup {
	WafilifeHomePage wafilifehomepage = new WafilifeHomePage();
	
	
	@Test
	public void HomePageTest() throws InterruptedException {
		getDriver().get(wafilifehomepage.homepage_url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wafilifehomepage.clickOnElement(wafilifehomepage.Lekhok);
		Thread.sleep(3000);
//		wafilifehomepage.scrollToElement(wafilifehomepage.ScrollToNextPage);
//		Thread.sleep(3000);
//		wafilifehomepage.clickOnElement(wafilifehomepage.NextPage);
//		Thread.sleep(3000);
		
		wafilifehomepage.scrollToElement(wafilifehomepage.Scroll2);
		Thread.sleep(2000);
		wafilifehomepage.clickOnElement(wafilifehomepage.AnuMahmud);
		Thread.sleep(2000);
		wafilifehomepage.clickOnElement(wafilifehomepage.Book);
		Thread.sleep(3000);
		wafilifehomepage.clickOnElement(wafilifehomepage.BookDetails);
		Thread.sleep(2000);
		wafilifehomepage.clickOnElement(wafilifehomepage.Order);
		Thread.sleep(2000);
		wafilifehomepage.clickOnElement(wafilifehomepage.PlaceOrder);
		Thread.sleep(4000);
		
		
		
		
		
	}

}
