package test;

public class getExcelDatas {

	static String projectPath=	System.getProperty("user.dir");
	public static void main(String[] args) {
		
  
		getTestData();
	}
	
	public static void getTestData() {
		 ExcelDemo exceldata = new ExcelDemo(projectPath+"\\excel\\data.xlsx" , "Sheet1");
		  int colCount=  exceldata.getExcelColCount();
		  int rowCount=  exceldata.getExcelRowCount();
		  
		  Object data[][]= new Object[rowCount-1][colCount-1];
		  
		  for(int i=1; i<rowCount;i++) {
			  
			  
			  for (int j=0; j<colCount;j++) {
				  
				 
		String cellStringValue=		  exceldata.getStringCellData(i, j);
		System.out.println(cellStringValue);
		data[i-1][j]=cellStringValue;
		
				  
			  }
		  }
		
		
	}

}
