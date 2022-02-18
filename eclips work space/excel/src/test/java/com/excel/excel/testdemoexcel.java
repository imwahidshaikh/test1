package com.excel.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testdemoexcel {
	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Wahid\\Documents\\DEMO AUTOMATION DATA.xlsx");
	FileInputStream z = new FileInputStream(file);
Workbook wb = new XSSFWorkbook(z);
Sheet sheet = (Sheet) wb.getSheet("Sheet1");
int lastrow = sheet.getLastRowNum();
int lastcellno = sheet.getRow(0).getLastCellNum();
for (int i = 0;i<lastrow;i++) {
Row row = sheet.getRow(i);
for (int j = 0 ; j<lastcellno ;j++ ) {
Cell cell = row.getCell(j);
String value = cell.getStringCellValue();
System.out.print(value + "  ");}
System.out.println();}
}
}
