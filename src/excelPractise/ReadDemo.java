package excelPractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDemo 
{
		public static void main(String[] args) throws IOException 
	{
		//load xlsx file
		FileInputStream fis = new FileInputStream("E:\\deepacorejavawork\\demo.xlsx");
		
		//Load Work Book 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(2);
		XSSFCell col = row.getCell(1);
		String value = col.getStringCellValue();
		System.out.println(value);
		
		XSSFRow row1 = sheet.getRow(6);
		XSSFCell col1 = row1.getCell(2);
		String value1 = col1.getStringCellValue();
		System.out.println(value1);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		//exact rowcount
		int totalrows = rowcount+1;
		System.out.println("total no of rows"+totalrows);
		
		//column count
		int colCount = sheet.getRow(rowcount).getLastCellNum();
		System.out.println(colCount);
		
		//to print all data in sheet using for loop
		for (int i = 0; i < totalrows; i++) 
		{
			for (int j = 0; j < colCount; j++) 
			{
				System.out.println(sheet.getRow(i).getCell(j));
				
			}
			
		}
		
	}

}
