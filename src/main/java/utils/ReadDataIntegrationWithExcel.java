package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataIntegrationWithExcel  {

	public static String[][] getExcelData(String fileName) {

		//String fileLocation = "./data/TC001.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int lastRowNum = wsheet.getLastRowNum();
		int physicalRow = wsheet.getPhysicalNumberOfRows();
		System.out.println("last row number " + lastRowNum); // exclude header row
		System.out.println("get physical row : " + physicalRow); // inclusive header row
		short lastcell = wsheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastcell];

		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow  row  = wsheet.getRow(i);
			for (int j = 0; j < lastcell; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//		        String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i-1][j] = value;
			} 
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
