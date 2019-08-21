package Simpleseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class CountlinksinGoogle {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Google.com");
		
		driver.manage().window().maximize();
		List<WebElement> value = driver.findElements(By.tagName("a"));
	     System.out.println(value.size());  //this will print the size of the links 
	     
	     for(WebElement i : value )
	     {
	      System.out.println(i.getText());
		
	     }
         Thread.sleep(2000);
         driver.switchTo().activeElement().sendKeys("JAva");
         Thread.sleep(2000);
        // List<WebElement> val = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li"));
         List<WebElement> val = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li/div"));
       
       System.out.println(val.size());
        for(WebElement i : val)
        {
        	System.out.println(i.getText());
        }
        //***another way to count suggestions 
        int count = 0;
        for(int i=0;i<=val.size();i++)
        {
        	count = i;
        }
        System.out.println(count);
        //driver.findElement(By.cssSelector("li[cl
        
        
	}

}
