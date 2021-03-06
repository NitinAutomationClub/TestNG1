package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig
{
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	int count=0;

	public ExcelDataConfig(String excelPath)
	{
		try {
			File src=new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		
		 
	catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
		public String getData(int sheetNumber,int row, int column)
		{
			
			sheet1=wb.getSheetAt(sheetNumber);
			String data=sheet1.getRow(row).getCell(column).getStringCellValue();
			
			return data;
			
		}	
		
		public int totalData()
		{
			count=sheet1.getLastRowNum();
			
			return count;
		}
	
		public int getRow(int sheetIndex)
		{
			int row=wb.getSheetAt(sheetIndex).getLastRowNum();
			row=row+1;
			return row;
			
		}



}
	
	
	
