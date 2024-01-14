package PSWebTests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	@Test(priority =2)
	public void enterPhoneNumber2() {
		Login ObjectL = new Login(obj);
		ObjectL.EnterNumber("7889023442");
		ObjectL.clickTORegister();
		ObjectL.clickToProceed();
	}
	
}