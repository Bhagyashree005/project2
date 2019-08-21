package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPage {

	@FindBy(id="txtUsername")
	private WebElement usid;
	@FindBy(id="txtpassword")
	private WebElement pwd;
	@FindBy(name ="btnlLogin")
	private WebElement Login;
	
	public OrangeHRMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void user(String us)
	{
		usid.sendKeys(us);
	}
	public void password(String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void login(String In)
	{
		Login.click();
	}
}
