package TestNGprograms;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
 
	@Parameters({"un", "pwd"})
	@Test
  public void test(@Optional("hello")String s1, String s2) {
		//optinal will use any one option 
		Reporter.log(s1, true);
		Reporter.log(s2, true);
  }
}
