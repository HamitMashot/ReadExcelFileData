package com.gemadicode.test;

import com.gemadicode.goldlibrary.ExcelDataConfig;

public class ReadExcelData {
	
	public static void main(String[] args) {
		
		ExcelDataConfig excel = new ExcelDataConfig("src/test/resources/ExcelData/TestData.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
		
	}

}
