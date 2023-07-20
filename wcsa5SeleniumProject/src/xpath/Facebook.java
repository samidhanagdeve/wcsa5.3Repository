package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123445");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("samidha");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")).click();
	}

}
