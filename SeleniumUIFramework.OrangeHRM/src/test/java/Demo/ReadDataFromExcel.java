package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("D:\\OrangeHRM_TestScriptData\\VacanciesData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("AddVacancy");
		Row r= sh.getRow(1);
		Cell c=r.getCell(1);
		String vacancyName =c.getStringCellValue();
		System.out.println(vacancyName);
		
		wb.close();
	}

}
