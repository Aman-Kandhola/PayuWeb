package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	static WebDriver driver;
	
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www-next.paysense.io/");
		driver.manage().window().maximize();
	}

	
	public void click(WebElement we){
		we.click();
	}
	
	
	public void sendKeys(WebElement we, String input) {
	    we.sendKeys(input);
	}
	
	

	public WebDriver getDriver() {
		
		return driver;
	}
	
}
