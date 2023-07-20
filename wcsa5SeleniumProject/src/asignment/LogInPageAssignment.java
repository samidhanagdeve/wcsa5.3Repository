package asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPageAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wendriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		
		driver.findElement(By.id("id_userLoginnId")).sendKeys("samidhanagdewe40@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("id_password")).sendKeys("abcdefgh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=btn login-button btn-submit btn-small]"));
	}

}
