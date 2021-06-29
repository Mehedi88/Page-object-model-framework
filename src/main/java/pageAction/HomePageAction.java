package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElement.HomePageElement;

public class HomePageAction extends HomePageElement {

	public HomePageAction(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}
	
	public void firstpage() {
		//click(cd);
		hooberover(cd);
		
	}
	
	public void secondPage() throws InterruptedException {
		click(rew);
		click(ben);
		Thread.sleep(3000);
		click(lm);
		
	}
	
	public void nextWin() throws InterruptedException {
		Thread.sleep(3000);
		window1();
		click(ab);
		click(hc);
		//driver.quit();
		
	}
	

}
