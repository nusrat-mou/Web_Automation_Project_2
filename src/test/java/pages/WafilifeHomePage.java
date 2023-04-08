package pages;

import org.openqa.selenium.By;

public class WafilifeHomePage extends BasePage{
	
	public String homepage_url = "https://www.wafilife.com/";
	
	public By Lekhok = By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/span[1]");
	public By ScrollToNextPage = By.xpath("//h3[normalize-space()='Dr. Mahdi Rizqullah Ahmad']");
    public By NextPage = By.xpath("//a[@class='next page-numbers']");
    public By Scroll2= By.xpath("//h3[normalize-space()='Dr. Abu Ameenah Bilal Philips']");
    public By AnuMahmud = By.xpath("//h3[normalize-space()='Dr. Anu Mahmud']");
    public By Book = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]");
    public By BookDetails = By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[2]/div[1]/div[1]/a[1]");
    public By Order = By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]");
    public By PlaceOrder = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
}
