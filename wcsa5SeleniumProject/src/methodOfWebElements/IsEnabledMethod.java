package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
		public static void main(String[] args) {
			System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.instagram.com/");
			driver.findElement(By.name("username")).sendKeys("_aa4b _add6 _ac4d");
			driver.findElement(By.name("password")).sendKeys("bjk");// disable
			//driver.findElement(By.name("password")).sendKeys("bjkscjnakd");//enable
			
			driver.findElement(By.xpath("//button[contains(@class,'_acap')]"));
		
	}

}
