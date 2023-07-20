package assig1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario13 {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		driver.findElement(By.xpath("//span[text()='Offers ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']/ancestor::a[@id='pid_80834")).click();
		
		 driver.close();
}
}