package Simpleseleniumprograms;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Bhagyashree/Desktop/Java/Links.html");
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		for(WebElement e : ele)
		{
			URL u = new URL(e.getAttribute("href"));
			HttpURLConnection connection =(HttpURLConnection)u.openConnection();
			int i= connection.getResponseCode();
			if(i==200)
			{
				
				System.out.println(" Link is not broken and the code is" +i);
				System.out.println(connection.getResponseMessage());
			}
			else
			{
				System.out.println(" Link is not broken and the code is" +i);
				System.out.println(connection.getResponseMessage());
			}
			driver.close();
			
		}
		
	}

}
