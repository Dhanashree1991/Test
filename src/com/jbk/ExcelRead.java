package com.jbk;

import java.io.FileInputStream;

import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead {
   public static void main(String[] args) throws BiffException, IOException  {
	//System.out.println(1);
	   FileInputStream fis=new FileInputStream("d:\\a.xls");
	 // System.out.println(2);
	
	  Workbook wk=Workbook.getWorkbook(fis);
	  //System.out.println(3);
	  
	  Sheet sheet=wk.getSheet(0);
	 // System.out.println(4);
	  int rows=sheet.getRows();
		System.out.println("rows...."+ rows);
	 // System.out.println(5);
	  int cols=sheet.getColumns();
			System.out.println("cols...."+ cols);
	 // System.out.println(6);
	  
	  
	 // Cell cell= sheet.getCell(0,0);
	  
	 // System.out.println(cell.getContents());
	  
	  for(int i=0;i<rows;i++){
		  
		  for(int j=0;j<cols;j++){
			  
			 // System.out.println(i);
			//  System.out.println(j);
			  
			  Cell cellss = sheet.getCell(j,i);
			  
			  System.out.println(cellss.getContents());
			   	  
			  
		  }
	  }
   } 
	  
}  
	  
	  
	  
