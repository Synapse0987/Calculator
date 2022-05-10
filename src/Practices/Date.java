import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args){
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.printf("Before formatting: %s%n",myDateTime);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("29-03-2022 21:50:00");
        String formattedDate = myDateTime.format(format);
        System.out.printf("After formatting: %s", formattedDate);
    }
}
