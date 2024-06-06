package test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	static String projectPath=	System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		
	//	getExcelRowCount();
	//	getStringCellData(1,1);
	}
	
	
	public ExcelDemo(String excelPath,String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet("Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	}
	
	
	
	public static int getExcelRowCount() {
		int rowCount=0;
	
		
		
		try {
			
		rowCount=	sheet.getPhysicalNumberOfRows();
		
		//System.out.println(rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowCount;
				
	}
	
public static int getExcelColCount() {
		
	int colCount=0;
		
		
		try {
			
	 colCount=	sheet.getRow(0).getPhysicalNumberOfCells();
		
		//System.out.println(colCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return colCount;
		
				
	}
	
	public static String getStringCellData(int userValue, int passValue) {
		String a0= null;
		try {
		
		a0=	 sheet.getRow(userValue).getCell(passValue).getStringCellValue();
		//System.out.println(a0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a0;
		
	}
	
public static double getNumericCellData(int userrow, int passcol) {
	double b1=0;
		try {
		
		 b1=	 sheet.getRow(userrow).getCell(passcol).getNumericCellValue();
		System.out.println(b1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b1;
		
	}
	
	

}
