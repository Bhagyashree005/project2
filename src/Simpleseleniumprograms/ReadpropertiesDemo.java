package Simpleseleniumprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

	Properties pro = new Properties();
	pro.load(new FileInputStream("C:\\Users\\Bhagyashree\\eclipse-workspace\\Selenium\\credents.properties"));
		System.out.println(pro.getProperty("URL"));
		
		
	}

}
