package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelectingProduct {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromrdriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='x']")).click();
		
		driver.findElement(By.xpath("input[@name='q']")).sendKeys("HP Laptop");
		
		driver.findElement(By.xpath("button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("div[text()='Core i5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("div[text()='Brand']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		
	}

}
