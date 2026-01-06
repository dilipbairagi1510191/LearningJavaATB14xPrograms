package Day40;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.apache.poi.ss.util.CellUtil.getCell;

public class ReadindDataFromExcel {
    public static void main(String[] args) throws IOException {

        //FileInputStream file=new FileInputStream("C:\\Users\\dilip\\IdeaProjects\\LearningJavaATB14xPrograms\\Pavan_Selenium_Project\\testData\\data.xlsx");
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\data.xlsx");

        XSSFWorkbook workbook=new XSSFWorkbook(file);

        XSSFSheet sheet=workbook.getSheet("Sheet1");

       int totalRow= sheet.getLastRowNum();

        int totalcell=sheet.getRow(1).getLastCellNum();

        System.out.println("Number of row:"+totalRow);
        System.out.println("Number of cells:"+totalcell);

        for(int r=0; r<=totalRow; r++)
        {
            XSSFRow currentrow=sheet.getRow(r);

            for(int c=0; c<totalcell; c++)
            {
                XSSFCell cell=currentrow.getCell(c);
                System.out.print(cell.toString()+"\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();

    }
}
