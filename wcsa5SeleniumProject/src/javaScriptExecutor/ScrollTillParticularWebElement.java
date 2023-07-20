package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		
		// To perform scrolling Opertaions for a newsElement 
		  // Location Of newsElement
//		Point loc = newsElement.getLocation();
//		int xaxis = loc.getX();
//		int yaxis = loc.getY();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
		jse.executeScript("arguments[0].scrollIntoView(false)",newsElement);

// scrollIntoView(false) is used to show" news "upppers webelement show and curser move to upword direction
// scrollIntoView(true) is used to show "news" lower webelement show and curser move to downword direction
       
	}

}