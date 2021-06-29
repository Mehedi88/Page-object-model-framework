package cptest;

import org.testng.annotations.Test;

import pageAction.HomePageAction;
import test.BaseTest;

public class Testcp extends BaseTest {
	
	@Test
	public void t() throws InterruptedException {
		
		HomePageAction act = new HomePageAction(driver);
		act.firstpage();
		act.secondPage();
		Thread.sleep(5000);
		act.nextWin();
		
		
	}

}
