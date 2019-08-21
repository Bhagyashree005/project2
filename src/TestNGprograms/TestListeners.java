package TestNGprograms;

import javax.xml.transform.Result;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class) // listners class name to be given 
public class TestListeners {
  @Test
  public void demo1() {
	 Reporter.log("from demo1", true); 
	 Assert.fail();
  }
  @Test
  public void demo2()
  {
	  Reporter.log("from demo2", true);
  }
}
