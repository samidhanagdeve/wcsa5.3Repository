
package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnMoveToElement{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.bluestone.com/"); // launch the bluestone web app
    
    driver.findElement(By.id("denyBtn")).click(); // handle the popup
    
    //driver.findElement(By.xpath("//a[text()='Coins ']")).click();
    
    Thread.sleep(2000);
    
    WebElement targetcoins = driver.findElement(By.xpath("//a[text()='Coins ']"));////a[text()='Coins '] here coins is given space for 1 0f 1 match find 
    
    // to perform mouse actions on webelement
    Actions act= new Actions(driver);
    
    //to perform mouseHover action
   
   act.moveToElement(targetcoins).perform();
   
   driver.findElement(By.xpath("//span[text()='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).click();
   WebElement coin=driver.findElement(By.id("5920"));
   if(coin.isDisplayed())
	{
		Thread.sleep(2000);
		driver.quit();
	}
	else {
		System.out.println("Exception!!!");
	}

}
}
