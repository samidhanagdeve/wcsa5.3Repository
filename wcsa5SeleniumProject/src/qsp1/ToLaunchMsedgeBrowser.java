package qsp1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchMsedgeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	
	Thread.sleep(2000);
	
	driver.close();
	
	
	}
}
