package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {
	//upcast into remoteDriver class
	 public static void main(String[] args) throws IOException {
		 System.setProperty("webedriver.chrome.driver", "./drivers.chromedriver.exe");
		 
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	
     	driver.get("https://www.selenium.dev/downloads/");
     	
     	File scr = driver.getScreenshotAs(OutputType.FILE);
   	    File dest = new File("./ScreenShot/ssway4.png");
   	    Files.copy(scr, dest);		
		 
	}

}
