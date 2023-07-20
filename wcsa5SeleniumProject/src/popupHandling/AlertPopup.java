package popupHandling;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		    System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		    WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get("file:///C:/Users/Samidha/Desktop/WCSA5/popup/alert.html");
		    
		    //to generate pop up button
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    Thread.sleep(2000);
		    
		    //handel alert popup
//		    Robot robot = new Robot();   
//		    robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(2000);  //control and //
//			
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
		    
		    // handle alert pop  by using switchTo()
		    
		   Alert al = driver.switchTo().alert();
		   Thread.sleep(2000); 
		   
		   //al.accept(); for accept the alert popup
		   //al.dismiss(); for dismiss the alert popup
		   
		   System.out.println(al.getText()); //returns the text of alert popup
		    
		    
		    
		    

	}

}
