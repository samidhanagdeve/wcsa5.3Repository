package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSyncronization1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lsks8j5/login.do");
		
		//loginPage
		String actualTitleOfLoginPage= driver.getTitle();
		if(actualTitleOfLoginPage.equals("actiTIME-Login"))
		{
			System.out.println("Title is matched,Test case passed||");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manger");
			driver.findElement(By.id("loginButton")).click();
		}
		else {
			System.out.println("we will get Exception");
		}
		String actualTitleofHomepage =driver.getTitle();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("actiTime- Enter Time-Track"));
		if(actualTitleofHomepage.equals("actiTIME-Enter Time-Track "))
		{
		System.out.println("Title is not matched, Test case Failed");	
		}		
	}
}
