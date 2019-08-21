package TestNGprograms;

//import org.junit.Before;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupsDemo {
  @BeforeClass(alwaysRun = true)//run this irrespective of groups (should run always)
	public void login()
	{
	  Reporter.log("login", true);
	}
	
  @Test(priority=1,groups= {"user","smoke"},dependsOnGroups= {"product"})
// depends works as "product" will get executed 1st later "user" will execute 
	  public void createUser()
	  {
		  Reporter.log("CreateUser", true);
	  }
	
  @Test(priority=2,groups= {"user"}, enabled=false)
  public void edituser() {
	  Reporter.log("delete", true);

  }
  @Test(priority=3,groups= {"product","smoke"})
  public void Createproduct()
  {
	  Reporter.log("Create product", true);

  }
  @Test(priority=4,groups= {"product"})//,dependsOnGroups= {"user"})
  public void Deleteproduct()
  {
	  Reporter.log("Delete product", true);

  }

  
}
