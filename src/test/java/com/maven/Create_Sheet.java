package com.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Create_Sheet {
public static void createsheet() throws IOException {
		File f = new File("C:\\Users\\Administrator\\eclipse-work\\MavenProject2\\target\\Datadriven for Sheet1.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook w = new XSSFWorkbook(fis);
        Sheet createSheet = w.createSheet("PriyaCreation244412");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Name");
		w.getSheet("PriyaCreation244412").getRow(0).createCell(1).setCellValue("dob");
		w.getSheet("PriyaCreation244412").getRow(0).createCell(2).setCellValue("phno");
		w.getSheet("PriyaCreation244412").getRow(0).createCell(3).setCellValue("Email id");
		w.getSheet("PriyaCreation244412").createRow(1).createCell(0).setCellValue("priya");
		w.getSheet("PriyaCreation244412").getRow(1).createCell(1).setCellValue("28 july");
		w.getSheet("PriyaCreation244412").getRow(1).createCell(2).setCellValue("9876665677");
		w.getSheet("PriyaCreation244412").getRow(1).createCell(3).setCellValue("priya@gmail.com");
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
			}
public static void Particulardata() throws IOException {
	File f = new File("C:\\Users\\Administrator\\eclipse-work\\MavenProject2\\target\\Datadriven for Sheet1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet sheet = w.getSheetAt(0);
	Row row = sheet.getRow(3);
    Cell cell = row.getCell(0);  
    CellType cellType = cell.getCellType();
    if (cellType.equals(cellType.STRING)) {
    	String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
    }
		else if (cellType.equals(cellType.NUMERIC)) {
		double value = cell.getNumericCellValue();	
		System.out.println(value);
	}

}
public static void main(String[] args) throws IOException {
	//createsheet();
	Particulardata();
}
}
