import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoAFile {
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("Test.txt");
            file.write("Files in Java might be tricky, but it is fun enough!\n I love coding!");
            file.close();
            System.out.println("Successfully wrote into the file");
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
