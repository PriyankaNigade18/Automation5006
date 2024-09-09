package com.TestNGFramework.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class RedingFromPropertiesFile {
  @Test
  public void testFile() throws IOException
  {
	  
	  //path of file to read
	  File f1=new File(System.getProperty("user.dir")+"//config.properties");
	  
	  //to read in stream
	  FileInputStream fs= new FileInputStream(f1);
	  
	  //we need to load the file
	  
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  //to read the data from file-getProperty(Key)
	  
	  System.out.println("Browser name is: "+p1.getProperty("bname"));
	  System.out.println("Url is: "+p1.getProperty("url"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
