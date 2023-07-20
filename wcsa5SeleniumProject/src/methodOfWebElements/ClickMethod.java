package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		 
		 // it is use to send inputs to text box and active Element
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Samidha/Desktop/WCSA5/Webelements/singledropdown.html");
		
		//WebElement dropDown =driver.findElement(By.id("menu"));
		//dropDown.click();
		driver.findElement(By.id("menu")).clear();
		
		
	}

}