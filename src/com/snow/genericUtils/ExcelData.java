package com.snow.genericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelData  {
	
	public static String getData(String path,String Sheet,int rn,int cn) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		Row r = sh.getRow(rn);
		Cell c = r.getCell(cn);
		String data = c.toString();
		return data;		
		
	}
	
	public static int rowCount(String path,String Sheet) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		
		FileInputStream fis = new FileInputStream(new File(path));		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		int rn = sh.getLastRowNum();
		return rn;
		
	}
	
	public static short cellCount(String path,String Sheet,int rn) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		Row r = sh.getRow(rn);
		short cn = r.getLastCellNum();
		return cn;
		
	}
	

}
