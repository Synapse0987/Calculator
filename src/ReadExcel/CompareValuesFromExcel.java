package ReadExcel;

import Calculator_Project.MathOperations;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class CompareValuesFromExcel {



    public static void main(String[] args) throws IOException{
        XSSFWorkbook wb = new XSSFWorkbook("Testing.xlsx");
        XSSFSheet ws = wb.getSheet("Test");
        MathOperations operator = new MathOperations();
        var valueArray = new ArrayList<Integer>();
        int totalRows = ws.getPhysicalNumberOfRows();

        for (int row=0;row<totalRows;row++){
            Row rowNo = ws.getRow(row);
            int totalCol = rowNo.getPhysicalNumberOfCells();
            for (int col=0;col<totalCol;col++){
                Cell cell = rowNo.getCell(col);
                int cellData = (int)cell.getNumericCellValue();
                valueArray.add(cellData);
            }
            if (valueArray.size() == totalCol){
                System.out.println(valueArray);
                System.out.println(operator.CompareValue(valueArray));
                rowNo.createCell(totalCol+1).setCellValue(operator.CompareValue(valueArray));
                valueArray.clear();
            }
        }
        try (FileOutputStream outputStream = new FileOutputStream("Testing2.xlsx", false)){
            wb.write(outputStream);
        }
    }
}

