package excelPractise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDemo 
{
	public static void main(String[] args) throws IOException 
	{
	
			//load xlsx file
			FileInputStream fis = new FileInputStream("E:\\deepacorejavawork\\demo.xlsx");
			
			//Load Work Book 
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheet("Sheet4");
			
			sheet.getRow(1).createCell(2).setCellValue("pass");
			sheet.getRow(2).createCell(2).setCellValue("pass");
			sheet.getRow(3).createCell(2).setCellValue("fail");
			
			FileOutputStream fo = new FileOutputStream("E:\\\\deepacorejavawork\\\\demo.xlsx");
			
			wb.write(fo);
	}
}
