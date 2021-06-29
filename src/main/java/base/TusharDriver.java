package base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TusharDriver {
	public WebDriver driver = null;

	public TusharDriver(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDiesplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void click(WebElement element) {
		if (isDiesplayed(element)) {
			element.click();
			System.out.println("Element click");
		} else {
		}
	}
	public void hooberover(WebElement credit) {
		Actions act = new Actions(driver);
		act.moveToElement(credit).build().perform();
	}
	public void window1() {
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> main = allwin.iterator();
		System.out.println(allwin.size());

		String win = main.next();
		String newW = main.next();
		driver.switchTo().window(newW);
	}

	public void wait(int sce) {
		try {
			Thread.sleep(sce * 100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void swait() {
		wait(1);

	}
}
