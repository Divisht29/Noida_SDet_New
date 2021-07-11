package com.crm.GenericsUtil;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertUtility {
	public String getPropertyKeyValue(String key) throws Throwable{
		FileInputStream file= new FileInputStream("D:\\NCA36\\noidasdet\\data\\commondata.property");
		Properties p=new Properties();
		p.load(file);
		return p.getProperty(key);
	

	}
}
