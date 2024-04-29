package org.example;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		String empData[][] = {
				{"1234","123","12"}
		};
		
		// Using for loop
		int rows = empData.length; //4
		int cols = empData[0].length; //3
		
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.createRow(r);
			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.createCell(c);
				String value = empData[r][c];
				
				cell.setCellValue(value);
				
				
			}
		}
		
		String filePath = "C:\\Users\\dkswl\\OneDrive\\Documents\\code_upload\\Auto_window\\multi_it\\backend\\web-workspace\\untitled1\\src\\main\\java\\org\\example\\test.xlsx";
		FileOutputStream outstream;
		
		outstream = new FileOutputStream(filePath);
		
		
		workbook.write(outstream);
		
		
		outstream.close();
		
		
		System.out.println("created!!");
		
		
	}
}