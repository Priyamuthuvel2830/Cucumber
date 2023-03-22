package com.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getsinglecolumn {
public static void readAllData() throws Exception {
	File f = new File("C:\\Users\\Administrator\\eclipse-work\\MavenProject2\\target\\Datadriven for Sheet1.xlsx");
    FileInputStream fis = new FileInputStream(f);
    Workbook w = new XSSFWorkbook(fis);
    Sheet sheetAt = w.getSheetAt(0);
   System.out.println("************Single Column**************");
   int numberOfRows = sheetAt.getPhysicalNumberOfRows();
   for (int i = 0; i < numberOfRows; i++) {
	Row row = sheetAt.getRow(i);
	Cell cell = row.getCell(1);
    CellType cellType = cell.getCellType();
    if (cellType.equals(CellType.STRING)) {
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
	     System.out.println(value);
	}
     
   }
   	}


public static void main(String[] args) throws Exception {
	readAllData();
}
}