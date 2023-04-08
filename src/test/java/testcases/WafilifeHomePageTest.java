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
		
		wafilifehomepage.writeText(wafilifehomepage.EnterName, "Nusrat Jahan Mou");
		Thread.sleep(2000);
		wafilifehomepage.writeText(wafilifehomepage.EnterPhoneNumber, "01768394744");
		Thread.sleep(2000);
		wafilifehomepage.writeText(wafilifehomepage.EnterEmailNumber, "nusrat123@gmail.com");
		Thread.sleep(2000);
		wafilifehomepage.clickOnElement(wafilifehomepage.Area);
		Thread.sleep(2000);
		wafilifehomepage.writeText(wafilifehomepage.Address, "Puran Dhaka a/2");
		Thread.sleep(4000);
		
		
		
		
		
	}

}
