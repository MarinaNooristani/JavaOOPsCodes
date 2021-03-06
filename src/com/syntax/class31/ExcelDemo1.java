package com.syntax.class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\marin\\OneDrive\\Desktop\\files to read\\Test.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        //special class that reads the Excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //First we get the sheets by specifying the name of the sheet
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        //we read the data row by row
        Row row = sheet.getRow(0);

        //reading the data cell by cell
        Cell cell = row.getCell(0);
        System.out.println(cell);

    }

}
