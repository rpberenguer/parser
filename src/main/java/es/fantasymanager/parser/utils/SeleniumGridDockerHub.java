package es.fantasymanager.parser.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.stereotype.Service;

@Service
public class SeleniumGridDockerHub {

	// Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public void setupDriver(String browser) throws MalformedURLException {
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		final ChromeOptions chromeOptions = new ChromeOptions(); 
		chromeOptions.addArguments("--no-sandbox"); 
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--disable-extensions");
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		
		// Set DesiredCapabilities
//		final DesiredCapabilities capabilities = new DesiredCapabilities();
//
//		// Set BrowserName
//		capabilities.setCapability("browserName", browser);

		// Set Browser to ThreadLocalMap
		//		driver.set(new RemoteWebDriver(new URL("http://192.168.99.100:31983/wd/hub"), capabilities));
		driver.set(new RemoteWebDriver(new URL("http://192.168.1.123:4444/wd/hub"), capabilities));
	}

	public void quitDriver() throws Exception {
		getDriver().quit();
	}

	public void removeDriver() {
		// Remove the ThreadLocalMap element
		driver.remove();
	}

	public WebDriver getDriver() {
		// Get driver from ThreadLocalMap
		return driver.get();
	}
}
