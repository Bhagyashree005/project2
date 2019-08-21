package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestDemo {
  @Test
  public void test() {
	  
	  Reporter.log("from test", false);
	  System.out.println("from test");
  }
}
