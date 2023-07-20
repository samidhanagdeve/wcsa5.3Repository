package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchCromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//relative path of driver executable file
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//launch chrome braowser(new)
		//upcast int webdriver
	    WebDriver driver=new ChromeDriver();
	 
	   //provide the delay of 2sec
	    Thread.sleep(2000);
	    
	    //to clse browser
	    driver.close();
	    
	}

}
