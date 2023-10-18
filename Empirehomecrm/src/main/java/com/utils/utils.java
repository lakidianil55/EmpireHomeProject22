package com.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;


public class utils {

	private static WebDriver driver;
	public static String[][] Data(String sheetname1) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\git\\EmpireHome_Crm_05\\Empirehomecrm\\src\\main\\java\\com\\testdata\\EmpireHome_Date0205.xlsx"); 
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet(sheetname1);

		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(1).getLastCellNum();

		String[][] data = new String[rowCount][colCount];
		DataFormatter dataFormatter = new DataFormatter();
		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet1.getRow(i);
			if (row != null) {
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {

						data[i - 1][j] = dataFormatter.formatCellValue(cell);

					}

				}
			}
		}
		return data;

	}	

	public static void clickElementWithJavascript(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void Robot() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void file() throws Throwable {
		StringSelection selection = new StringSelection("\"C:\\Users\\DELL\\OneDrive\\Pictures\\chair.jfif\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	}

public static void Dropdown(WebElement value,int index) {
	Select s = new Select(value);
	s.selectByIndex(index);
	
}
}
