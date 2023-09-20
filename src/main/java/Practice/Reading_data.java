package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data {
	static XSSFWorkbook wb;
	static XSSFSheet sheet ;
	static XSSFRow row ;
	static XSSFCell cell;
	public  static Object [][] get_table_array() throws Exception {
		//System.out.println("hello 1");
	String[][] tab_array=null;
		try {
			FileInputStream file = new FileInputStream("/Users/mohammadafzal/eclipse-workspace/Selenium_Tests/Test-data/GMTestData.xlsx");
		XSSFWorkbook wb=  new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("CheckPrice");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
	
		int total_row = sheet.getLastRowNum();
		int totalcol = row.getLastCellNum();
		System.out.println("total col: "+totalcol+" totla row: "+total_row);
		
		cell = row.getCell(0);
		System.out.println(cell);
		
		tab_array = new String[total_row][totalcol];		
		for (int i=0; i<=total_row; i++ ) {
			for (int j =0; j<totalcol; j++) {
				//tab_array[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				tab_array[i][j]=getCellData(i,j);
				System.out.println(tab_array[i][j]);
						
						
			}
		}
		
		
		
	
		return tab_array;
		}	
		
		catch(FileNotFoundException e) {
			System.out.println("file not there");
			e.printStackTrace();	
		}
		
		catch(IOException e) {
			System.out.println("file not there hahah");
			e.printStackTrace();	
		}
		
		return tab_array;
	}
	
	public  static String getCellData(int RowNum, int ColNum) throws Exception {

		try{

			cell =sheet.getRow(RowNum).getCell(ColNum);

			int dataType = cell.getCellType();

			if  (dataType == 3) {

				return "";

			}
			else{

				String CellData = cell.getStringCellValue();

				return CellData;

			}
			}
			catch (Exception e){

			System.out.println(e.getMessage());

			throw (e);

			}

		}

	

	
	public static void main(String[] args) throws Exception {
		
		
		
		
		get_table_array();
		
		
		// n calling class
//		@DataProvider
//
//	    public Object[][] Authentication() throws Exception{
//
//	         Object[][] testObjArray = ExcelUtils.getTableArray("D://ToolsQA//OnlineStore//src//testData//TestData.xlsx","Sheet1");
//
//	         return (testObjArray);
//
//			}

	}

}
