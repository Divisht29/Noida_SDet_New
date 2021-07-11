package com.crm.GenericsUtil;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

/**
 * This class contains java specific generic libraries
 * @author divis
 *
 */
public class JavaUtility {
	
	/**
	 * Generic Random Number
	 * @return
	 * 
	 */
	@Test
	public static void getRandomData()
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		//return "_"+ran;
		System.out.println(ran);
		
	}
	
	/**
	 * 
	 * Generate Current System Date
	 * @return
	 */
	



public String getCurrentSystemData()
{
	Date date=new Date();
	String currentDate=date.toString();
	return currentDate;
	
}


}

