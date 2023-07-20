package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSynchronization {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("samidha");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
    //driver.findElement(By.xpath("//div[@class='x9f619']").click
    
}

}
