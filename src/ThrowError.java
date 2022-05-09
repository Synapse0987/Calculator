import java.util.Scanner;

public class ThrowError {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("You are not old enough!");
        } else{
            System.out.println("Go ahead!");
        }
    }
    public static void main(String[] args){
        Scanner userAge = new Scanner(System.in);
        System.out.println("Enter Age: ");
        checkAge(userAge.nextInt());
    }
}
