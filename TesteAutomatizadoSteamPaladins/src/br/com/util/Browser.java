package br.com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {

	/**
	 * Code used to create a internet explorer browser screen.
	 * @return The internet explorer browser
	 */
	public WebDriver ieBrowsing() {
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); 
		WebDriver browser = new InternetExplorerDriver(ieCapabilities);
		return browser;
	}

	/**
	 * Code used to create a firefox browser screen.
	 * @return The firefox browser
	 */
	public WebDriver firefoxBrowsing() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tecnico\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
	return browser;
	}

	/**
	 * Code used to create a chrome browser screen.
	 * @return The chrome browser
	 */
	
	public WebDriver chromeBrowsing(){
		//WebDriver browser = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C://Users//joyce_bastos//Documents//chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	return driver;
	}
}