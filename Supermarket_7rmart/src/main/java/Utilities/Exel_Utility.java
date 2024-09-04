package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constants;

public class Exel_Utility {

	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet sh, sh1;

	public static String getStringData(int a, int b, String sheet1) throws IOException {
		String filePath = Constants.TESTDATAFILE;

		f = new FileInputStream(filePath);

		w = new XSSFWorkbook(f);

		sh = w.getSheet(sheet1);

		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getStringData2(int a, int b, String sheet1) throws IOException {
		String filePath = Constants.TESTCATFILED;

		f = new FileInputStream(filePath);

		w = new XSSFWorkbook(f);

		sh = w.getSheet(sheet1);

		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static String getIntegerData(int a, int b, String sheet1) throws IOException {
		String filepath = Constants.TESTDATAFILE;
		f = new FileInputStream(filepath);
		w = new XSSFWorkbook(f);
		sh = w.getSheet(sheet1);
		Row r = sh.getRow(a);
		Cell c = r.getCell(b);
		int x = (int) c.getNumericCellValue();
		return String.valueOf(x);
	}

}
