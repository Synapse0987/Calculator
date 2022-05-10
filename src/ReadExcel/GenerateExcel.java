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

        for(int i=0;i<10;i++){
            Row row = ws.createRow(i);
            Cell cell = row.createCell(0);
            cell.setCellValue(generateNo());
        }

        try (FileOutputStream outputStream = new FileOutputStream("Testing.xlsx")){
            wb.write(outputStream);
        }
    }
}
