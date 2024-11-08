package com.centrepoint.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 
{
	public String  getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./src/test/resources/CentrePointCommonData.properties");
		Properties pobj=new Properties();
		pobj.load(file);
		String value=pobj.getProperty(key);
	    return	value;
	}

}
