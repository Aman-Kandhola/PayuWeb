package PSWebTests;

import org.testng.annotations.Test;

import BaseClass.BaseSetup;
import PagesObject.Login;

public class testcases extends BaseSetup{

	@Test
	public void enterPhoneNumber() {
		Login ObjectL = new Login(obj);
		ObjectL.EnterNumber("7889023442");
		ObjectL.clickTORegister();
		ObjectL.clickToProceed();
	}
	
	
}
