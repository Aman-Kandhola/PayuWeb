package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageOR {

	@FindBy(xpath="//input[@name='phoneNumber']")
	protected WebElement  mobileInput;
	
	@FindBy(xpath="//button[text()='Get Started']")
	protected WebElement GetStartedButton;

	@FindBy(xpath="//button[text()='Proceed']")
	protected WebElement ProceedButton;
}
