package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeonDepencencyMethod {
  @Test(priority=1)
  public void Create() {
	  Reporter.log("method created", true);
  }
  
  @Test(priority=2,dependsOnMethods={"Create"})
  public void Delete() {
	  Reporter.log("method deleted", true);
	  
  }
  
  
  
  
}
