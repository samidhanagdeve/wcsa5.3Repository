package keywordDriverFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestwithoutuseIauto extends Flib{
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData("./data/config.properties", "Browser"); // Don use browser
		String url = flib.readPropertyData("./data/config.properties", "Url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", "./drivers/gechodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Enter valid browserValue!!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	    }
	public void closeBrowser()
	{
		driver.quit();
	}
}
