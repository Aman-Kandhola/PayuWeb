package BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseSetup {

  public static Utility obj;
	
  @BeforeSuite
  public void initialize() {
	  obj = new Utility();
  }
  
  @BeforeClass
  public void launch() {
	  obj.LaunchBrowser();
  }
	
}
