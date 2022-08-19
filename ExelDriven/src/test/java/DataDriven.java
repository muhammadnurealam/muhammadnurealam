import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
		public ArrayList<String> getdata(String TestcaseName) throws IOException {
			
		// 	by using apache poi api we can data collect from excel to java
			// poi ooxml and poi jar helps to send data from excel to java
			
		
		//indentify emp2 coloum by scnneing from entire 1st row
		//then scan all emp2 coloum to identtify purches row
		//the pull all data from purches row
		
		ArrayList<String> a=new ArrayList<String>();
 
		FileInputStream file= new FileInputStream("C:\\xlTestCase\\tabel.xlsx");
		
	   XSSFWorkbook workbook=new XSSFWorkbook(file);
	   
	   
	  int sheets= workbook.getNumberOfSheets();
	  
	  for(int i=0; i<sheets;i++) {
		  
		  if(workbook.getSheetName(i).equalsIgnoreCase("EMPLOYEE TABEL"));
		  
		 XSSFSheet sheet= workbook.getSheetAt(i);//sheet is a collection of row
		 
		 Iterator<Row> rows=sheet.rowIterator();	//row is collection of cells	 		
		 Row firstrow= rows.next();
		
		Iterator<Cell> cels=firstrow.cellIterator();
		
		int k=0;
		int coloum=0;
		
		while(cels.hasNext()) {
		Cell value=cels.next();
		
		if(value.getStringCellValue().equalsIgnoreCase("EMPLOYEE_ID")) {
			
			coloum=k;
		}
		  k++;
		}

		System.out.println(coloum);
	  
	   
	
	  
	  while(rows.hasNext()){
		  
		Row r=  rows.next();
		
		if(r.getCell(coloum).getStringCellValue().equalsIgnoreCase(TestcaseName));{
		
			Iterator <Cell> cv=	r.cellIterator();
		while(cv.hasNext()) {
			Cell c=cv.next();
			
			if(c.getCellType()==CellType.STRING) {
				a.add(c.getStringCellValue());
				
			}
			
			else{
			a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
				
			}
			
			
		}
				
		}
		  
	  }
		  
	  }
	  return a;
	    
	}
public static void main(String[] args) throws IOException {
	
	DataDriven db= new DataDriven();
	ArrayList data=db.getdata("103");
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
	
}

}
