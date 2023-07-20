package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers/firefoxdriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
	}

}
