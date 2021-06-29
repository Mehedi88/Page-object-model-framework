package test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import base.R_WPropertiesFile;

public class BaseTest {

	public WebDriver driver = null;

	@BeforeClass
	public void start() throws IOException {

		Properties prop = new R_WPropertiesFile().rwProperties(
				"C:\\Users\\Tusha\\eclipse-workspace\\Capitalone\\src\\main\\java\\base\\config\\config.properties");

		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser name is chrome");
			System.setProperty("webdriver.chrome.driver", "C:/Dev/Chrome/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("Browser name is Firefox");
			System.setProperty("", " ");
			driver = new FirefoxDriver();

		} else {
			System.out.println("No browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.capitalone.com");

	}

}
