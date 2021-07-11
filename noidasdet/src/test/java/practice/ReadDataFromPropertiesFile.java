package practice;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertiesFile {

	@Test
	public void readDataTest() throws IOException {
		//read the data from properties file
		// step 1 get the java from representation of physical
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//step 2 create an object of the properties class and load all the key value pair
		Properties pObj=new Properties();
		pObj.load(fis);
		
		//step 3 read the value using get property("key")
		String URL=pObj.getProperty("url");
		System.out.println(URL);
				
				
		
	}
}
