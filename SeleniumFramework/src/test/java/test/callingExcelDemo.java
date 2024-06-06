package test;

public class callingExcelDemo {
	static String projectPath=	System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExcelDemo excel= new ExcelDemo(projectPath+"\\excel\\data.xlsx" , "Sheet1");

excel.getStringCellData(0, 0);
excel.getNumericCellData(1, 1);
excel.getExcelRowCount();
excel.getExcelColCount();
	}

}
