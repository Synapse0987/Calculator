package Calculator_Project;
import java.util.Scanner;

public class Calculator {



    public static void main(String[] args){
        float sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired function. +-*/");
        char sign = input.nextLine().charAt(0);
        System.out.println("Enter first number: ");
        float x = input.nextInt();
        System.out.println("Enter second number: ");
        float y = input.nextInt();


        System.out.println("Result is: " + sum);
    }
}
