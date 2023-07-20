package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSynchronization {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.instagram.com/");
	
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Samidh123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
	}
