package Simpleseleniumprograms;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	static {
	      System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
	}
	
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("file:///C:/Users/Bhagyashree/Desktop/Java/Demo2.html");
WebElement listbox = driver.findElement(By.id("slv"));
Select sel = new Select(listbox);
sel.selectByValue("R");
sel.selectByIndex(02);

List<WebElement> order = sel.getAllSelectedOptions();
System.out.println(order.size());

WebElement first = sel.getFirstSelectedOption();
System.out.println(first.getText());

if(sel.isMultiple())
{
	System.out.println("listbox is multiple");
	sel.deselectByValue("R");
	//sel.getWrappedElement();
}
WebElement list = sel.getWrappedElement();
System.out.println(list.getText());
System.out.println("*************");

List<WebElement> Lst = sel.getOptions();
// if(empty.isEmpty())
// 
//	 System.out.println("list is empty");
// 
// else 
// {
//	 System.out.println("list is not empty");
// }
 
 //for sorting
 TreeSet<String> tr = new TreeSet<String>();
 for(WebElement tr1:Lst)
 {
     String txt2 = tr1.getText();
	 tr.add(txt2);
	 
	}
 System.out.println(tr); // this displays sorting print
  NavigableSet<String> desc = tr.descendingSet();
 System.out.println(desc); // descending order to print
  Iterator<String> dt = tr.descendingIterator(); // descending order prints using iterator 
  while(dt.hasNext())
  {
	  System.out.println(dt.next());
  }
//System.out.println(dt);
 
// int n = Lst.size();
// for(int i = 0;i<=n;i++)
// {
//	  System.out.println(tr.descendingIterator()); 
// }
 
}
}
