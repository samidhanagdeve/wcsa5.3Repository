package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ClickMethod {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webedriver.chrome.driver","./drivers.chromedriver.exe");
		 
		RemoteWebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.get("file:///C:/Users/Samidha/Desktop/WCSA5/Webelements/singledropdown.html");
    	
    	File scr = driver.getScreenshotAs(OutputType.FILE);
  	    File dest = new File("./ScreenShot/ssway6.png");
  	    Files.copy(scr, dest);	

}
}
