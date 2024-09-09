package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
	Properties p1;

	public ConfigReader(String filename)
	{
		p1=new Properties();
		//load the file
		File f1=new File(System.getProperty("user.dir")+"//"+filename+".properties");
		FileInputStream fs;
		try {
			fs=new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
	
	
}
