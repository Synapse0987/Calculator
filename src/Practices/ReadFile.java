import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try{
            File file = new File("Test.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("File cannot be found");
            e.printStackTrace();
        }
    }
}
