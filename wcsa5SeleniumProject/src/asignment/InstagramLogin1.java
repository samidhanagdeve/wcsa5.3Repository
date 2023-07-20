package asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Samidh123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
