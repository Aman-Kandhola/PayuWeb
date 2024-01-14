package PagesObject;

import org.openqa.selenium.support.PageFactory;


import BaseClass.Utility;
import PageObjectRepo.LoginPageOR;

public class Login extends LoginPageOR{
	
	
   public Utility LoginUtilityObj;	
	
   public void EnterNumber(String numberfromtest) {
	 LoginUtilityObj.sendKeys(mobileInput,numberfromtest); 
   }
  
   public void clickTORegister() {
	   LoginUtilityObj.click(GetStartedButton);
   }
    public void clickToProceed() {
    	LoginUtilityObj.click(ProceedButton);
    }
  
	    public Login(Utility utlObjectComingfromUtility) {
		this.LoginUtilityObj = utlObjectComingfromUtility;
		PageFactory.initElements(utlObjectComingfromUtility.getDriver(), this);
	    }
   
}
