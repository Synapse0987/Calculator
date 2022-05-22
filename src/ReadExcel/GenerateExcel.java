package ReadExcel;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenerateExcel {

    public static int generateNo() {
        return (ThreadLocalRandom.current().nextInt(1, 10));
    }

    public static void main(String[] args) throws IOException {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet("Test");



        for(int row = 0;row<10;row++) {
            Row rowNo = ws.createRow(row);
            for (int column = 0; column < 3; column++) {
                Cell cell = rowNo.createCell(column);
                cell.setCellValue(generateNo());
            }
            }

        try (FileOutputStream outputStream = new FileOutputStream("Testing.xlsx")){
            wb.write(outputStream);
        }
    }
}
