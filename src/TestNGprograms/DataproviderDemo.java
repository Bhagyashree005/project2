package TestNGprograms;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class DataproviderDemo {
  @Test(dataProvider = "users")
  public void f(String un, String pw) {
	  Reporter.log("create: "+un+" pwd:"+pw, true);
  }

  @DataProvider(name ="users")
  public String[][] getData() {
	String[][] data =new String[3][2];
	data[0][0]="user A";
	data[0][1] ="A1";
	data[1][0]="user B";
	data[1][1]="B1";
	data[2][0]="user C";
	data[2][1]="c1";

	  return data;
   
  }
 
  
}
