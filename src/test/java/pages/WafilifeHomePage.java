package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

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
    public By EnterName = By.xpath("//input[@id='billing_first_name']");
    public By EnterPhoneNumber = By.xpath("//input[@id='billing_phone']");
    public By EnterEmailNumber = By.xpath("//input[@id='billing_email']");
    public By Area = By.xpath("//select[@id='billing_area']");
    public By Address = By.xpath(" //textarea[@id='billing_address_1']");
}
