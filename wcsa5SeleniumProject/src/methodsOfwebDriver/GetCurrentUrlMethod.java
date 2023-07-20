package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String CurrentUrl= driver.getCurrentUrl();
		System.out.println("currentUrl");
		
	}

}
