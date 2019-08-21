package TestNGprograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenersDemo implements ITestListener {
	static int passcount=0,failcount=0;
	
	
//  @Override
//  public void OnTestStrart(ITestResult result) {
//	  String name = result.getName();
//	  Reporter.log("test"+name+"is started", true);
	  
 // }
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String name = result.getName();
		  Reporter.log("test"+name+"is started", true);
		  
	}

  
  @Override
  public void onTestSuccess(ITestResult result)
  {
	  String name = result.getName();
	  Reporter.log("test"+name+"is pass", true);
	  passcount++; 
  }
  @Override
  public void onTestSkipped(ITestResult result)
  {
	  
  }
  
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	String name = context.getClass().toString();
	Reporter.log(name+"started",true);
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	Reporter.log("pass"+passcount, true);
	Reporter.log("fail"+failcount, true);
	
}


@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}
  
  
}
