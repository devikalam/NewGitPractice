package excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityClass {
	
	public String getDataFromExceFile(String sheetname,int rownum,int colnum) throws Throwable {
		ExcelUtilityClass ex=new ExcelUtilityClass();
		FileInputStream fis=new FileInputStream("./src/test/resources/jupiter.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		String data = sh.getRow(rownum).getCell(colnum).getStringCellValue();
		return data;
		
	}
	}



