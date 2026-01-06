package Day41;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtil {

    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    // ------------------ Get Row Count ------------------
    public static int getRowCount(String filePath, String sheetName) throws IOException {
        fi = new FileInputStream(filePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);

        int rowcount = ws.getLastRowNum();

        wb.close();
        fi.close();
        return rowcount;
    }

    // ------------------ Get Cell Data ------------------
    public static String getCellData(String filePath, String sheetName, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(filePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);

        row = ws.getRow(rownum);
        cell = row.getCell(colnum);

        String data;
        try {
            data = cell.toString();
        } catch (Exception e) {
            data = "";
        }

        wb.close();
        fi.close();
        return data;
    }

    // ------------------ Set Cell Data ------------------
    public static void setCellData(String filePath, String sheetName, int rownum, int colnum, String data)
            throws IOException {

        fi = new FileInputStream(filePath);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);

        row = ws.getRow(rownum);
        if (row == null) {
            row = ws.createRow(rownum);
        }

        cell = row.getCell(colnum);
        if (cell == null) {
            cell = row.createCell(colnum);
        }

        cell.setCellValue(data);

        fo = new FileOutputStream(filePath);
        wb.write(fo);

        wb.close();
        fi.close();
        fo.close();
    }
}
