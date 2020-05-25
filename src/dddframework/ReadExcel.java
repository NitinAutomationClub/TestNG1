package dddframework;

import lib.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("D:\\Selenium\\Excel Data\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		
		int total=excel.totalData();
		System.out.println("Total Row : "+total);
		System.out.println("User Name   Password");
		for(int i=0;i<total;i++)
		{
			
			String data0=excel.getData(0, i, 0);
			
			String data1=excel.getData(0, i, 1);
			
			System.out.println(data0+"   "+data1);
			
			
			
		}
		
		
		

	}

}
