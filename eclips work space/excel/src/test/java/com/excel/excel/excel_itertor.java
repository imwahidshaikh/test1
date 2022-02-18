package com.excel.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_itertor {

	public static void main(String[] args) throws IOException {
	File file = new File("F:\\java excel.xlsx");
	FileInputStream z = new FileInputStream(file);
	Workbook wb = new XSSFWorkbook(z);
	Sheet sheet = (Sheet) wb.getSheet("Sheet1");
	Iterator <Row> itrow = sheet.iterator();
	while(itrow.hasNext()) {
		Row row = itrow.next(); 
		Iterator <Cell> itcell = row.iterator();
		while(itcell.hasNext()) {
			Cell cell = itcell.next();
			System.out.print(cell+ " ");
		}
		System.out.println();
		
		
		
	}
	
	
	
	
	
	}

}
