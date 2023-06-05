package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

       String path=System.getProperty("user.dir")+"\\Files\\TestExcelFile.xlsx";
       FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
      //  Sheet sheet= xssfWorkbook.createSheet("Sheet1");
        Sheet sheet= xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell=row.createCell(0);
        Cell cell1=row.createCell(1);
        cell.setCellValue("Weal");
        cell1.setCellValue("Jacob");

        FileOutputStream fileOutputStream=new FileOutputStream(System.getProperty("user.dir")+"\\Files\\TestExcelFile.xlsx");
        xssfWorkbook.write(fileOutputStream);


    }
}
