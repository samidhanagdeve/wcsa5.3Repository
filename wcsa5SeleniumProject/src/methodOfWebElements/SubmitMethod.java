package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("_aa4b _add6 _ac4d");
		driver.findElement(By.name("password")).sendKeys("bjk");// disable
		//driver.findElement(By.name("password")).sendKeys("bjkscjnakd");//enable
		
		WebElement LoginButton= driver.findElement(By.xpath("//button[contains(@class,'_acap')]"));
		LoginButton.submit();
		
		driver.navigate().to("http://127.0.0.1/login.jsp");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("manager");
		WebElement LoginButton2 =driver.findElement(By.id("loginButton"));
		
		//LoginButton2=
		LoginButton2.click();
		

}
}
