package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest02 {
  @Test
  public void f() {
	  
	  
	  Reporter.log("from test", false);
	  System.out.println("from test");
  }
}
