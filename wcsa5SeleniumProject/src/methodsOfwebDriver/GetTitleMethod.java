package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
