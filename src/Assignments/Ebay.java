package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	@BeforeMethod 
	public void Opensite(){
		driver = new ChromeDriver();
		  driver.get("https://in.ebay.com/");
		  driver.manage().window().maximize();	
		
	}
  @Test
  public void VerifyEbayhome() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple watches");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//select[@id='gh-cat']")).click();
	  WebElement  list = driver.findElement(By.xpath("//select[@id='gh-cat']"));
	  Select sel = new Select(list);
	  sel.selectByVisibleText("Baby");
	  Thread.sleep(3000);
	  List<WebElement> itemlist = driver.findElements(By.xpath("//h3[@class='s-item__title']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    for(int i=0;i<=20;i++)
	    {
	    	js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(1000);
	    

		}
	    for(WebElement print : itemlist)
	    {
	    	System.out.println(print.getText());
	    }
	    
	  
	  //this prints all the categories names 
	  //WebElement choose = sel.getWrappedElement();
	  //System.out.println(choose.getText());

	  
	  
  }
}
