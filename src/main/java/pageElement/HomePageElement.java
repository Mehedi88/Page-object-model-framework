package pageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import base.TusharDriver;

public class HomePageElement extends TusharDriver{

	public HomePageElement(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//span[text()='Credit Cards']")
	public WebElement cd;
	
	@FindBy(xpath = "//span[text()='Travel Rewards']")
	public WebElement rew;
	
	@FindBy(xpath = "//a[text()='See All Card Benefits']")
	public WebElement ben;
	
	@FindBy (xpath = "(//a[text( )='Learn More'])[1]")
	public WebElement lm;
	
	@FindBy(xpath = "//a[text()='Tools']]")
	public WebElement part;
	
    @FindBy(xpath = "//a[text()='About']")
	public WebElement ab;
    
    @FindBy(xpath = "//h3[text()='Helping Our Customers']")
    public WebElement hc;

}
