package Simpleseleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.io.Files;

public class Demo01 {

	static {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.out.println(" Browser launches");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.Google.com");
		//Thread.sleep(5000);
		driver.manage().window().maximize();

		
		//*****Screenshot taking method 
		TakesScreenshot pic = (TakesScreenshot)driver;
		File src = pic.getScreenshotAs(OutputType.FILE);
		File dest = new File("C://Users//Bhagyashree//Downloads/a.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
		
		
	}

}
