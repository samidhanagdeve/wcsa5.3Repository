package popupHandling;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmtionPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		    WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get("file:///C:/Users/Samidha/Desktop/WCSA5/popup/confirm.html");
		    driver.findElement(By.tagName("input")).click();
		    Thread.sleep(2000);

		   Alert al = driver.switchTo().alert();
		   Thread.sleep(2000);
		   //al.accept(); accept the confirmation pop up
		   
		   
		   System.out.println(al.getText());
		   al.sendKeys("GetText");
		   al.dismiss(); //dismiss the confirmation pop up

}
}
