package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMflipkartPage {
@FindBy(xpath="//div[@id='container']/div/descendant ::img")
private List<WebElement> img;

public POMflipkartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}


public int imgsize() {
	
return img.size();
			
}
}

