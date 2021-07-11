package practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateCustomer {
	@Test
    
	   public void createCustomerTest(XmlTest xml) {
			
			System.out.println("Execute Test1");
			String BROWSER = xml.getParameter("browser");
			String USERNAME = xml.getParameter("username");
			String PASSWORD = xml.getParameter("password");
			System.out.println(BROWSER);
			System.out.println(USERNAME);
			System.out.println(PASSWORD);
	    
			
		}
		
		
	}


