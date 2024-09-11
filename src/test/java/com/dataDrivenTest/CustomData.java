package com.dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="mydata")
	public Object[][] testData()
	{
		Object arr[][]= {{"Admin","admin123"},{"Amit","test123"},{"Shreya","test123"},{"Admin","admin123"}};
		return arr;
	}
	
	 XSSFWorkbook wb;
	 @DataProvider(name="exceldata")
	public Object[][] excelData()
	{
		//File path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  FileInputStream fs;
		  Object arr[][]=null;
		try {
			fs = new FileInputStream(f1);
			//wb-->sheet-->row--->cell
		  	wb=new XSSFWorkbook(fs);
		  	 //get the number of rows
			  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
			  System.out.println("Number of rows: "+rows);
			  
			  //get the number of columns
			  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of columns: "+cells);
			  
			  
			  //declare array of same size
			  arr =new Object[rows-1][cells];
			  
			  //iterate array and get the data from file and store it into array
			  for(int i=1;i<rows;i++)
			  {
				  for(int j=0;j<cells;j++)
				  {
					  arr[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
					  //System.out.print(arr[i-1][j]+"    ");
				  }
				  System.out.println();
			  }
			  
			 
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		return arr;
		 
		  //return array for data provider
		  
		  
		  
		  
		  
		  
	}
}
