import java.util.Scanner;

public class Add2Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int x = input.nextInt();
        System.out.println("Insert second number: ");
        int y = input.nextInt();
        int sum = x + y;
        System.out.println("Sum is: "+ sum);
    }
}
