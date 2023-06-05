package class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
     public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        //int rowSize=sheet.getPhysicalNumberOfRows();

         for (int rows = 0; rows <sheet.getPhysicalNumberOfRows(); rows++) {
             Row row=sheet.getRow(rows);
             //nt colSize=row.getPhysicalNumberOfCells();
             for(int col=0; col<row.getPhysicalNumberOfCells(); col++){
                 System.out.print(row.getCell(col)+" ");
             }
             System.out.println();
         }

         // Cell cell=row.getCell(1);
         // System.out.println(cell);

         /*System.out.print(row.getCell(0)+" ");
         System.out.print(row.getCell(1)+" ");
         System.out.print(row.getCell(2)+" ");
         System.out.print(row.getCell(3)+" ");
         System.out.print(row.getCell(4));*/




    }
}
