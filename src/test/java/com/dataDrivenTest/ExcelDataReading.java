package com.dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataReading {
  @Test
  public void dataRead() throws IOException
  {
	  
	  //File path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row--->cell
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //get the number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows: "+rows);
	  
	  //get the number of columns
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of columns: "+cells);
	  
	  
	  //declare array of same size
	  Object arr[][]=new Object[rows-1][cells];
	  
	  //iterate array and get the data from file and store it into array
	  for(int i=1;i<rows;i++)
	  {
		  for(int j=0;j<cells;j++)
		  {
			  arr[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(arr[i-1][j]+"    ");
		  }
		  System.out.println();
	  }
	  
	  
	  //return array for data provider
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //to read single entry
//	  String value=wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  
//	 XSSFRow row1= sheet1.getRow(2);
//	 
//	 XSSFCell cell1=row1.getCell(0);
//	 
//	 String value=cell1.getStringCellValue();
//	 
//	  System.out.println(value);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
