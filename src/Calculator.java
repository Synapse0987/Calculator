import java.util.Scanner;

public class Calculator {
    public float addition(float x, float y){
        return(x+y);
    }
    public float minus(float x, float y){
        return(x-y);
    }
    public float division(float x, float y){
        return(x/y);
    }
    public float multiply(float x, float y){
        return(x*y);
    }

    public static void main(String[] args){
        float x, y;
        float sum = 0;
        char sign;
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired function. +-*/");
        sign = input.nextLine().charAt(0);
        System.out.println("Enter first number: ");
        x = input.nextInt();
        System.out.println("Enter second number: ");
        y = input.nextInt();
        switch (sign){
            case '+' :{
                sum = calculator.addition(x,y);
                break;
            }
            case '-' :{
                sum = calculator.minus(x,y);
                break;
            }
            case '*' :{
                sum = calculator.multiply(x,y);
                break;
            }
            case '/' :{
                sum = calculator.division(x,y);
                break;
            }
        }
        System.out.printf("Result is: " + sum);
    }
}
