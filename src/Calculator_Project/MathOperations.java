package Calculator_Project;

import java.util.ArrayList;

public class MathOperations{
    public int addition(int x, int y){
        return(x+y);
    }
    public int minus(int x, int y){
        return(x-y);
    }
    public int division(int x, int y){
        return(x/y);
    }
    public int multiply(int x, int y){
        return(x*y);
    }
    public int CompareValue(ArrayList<Integer> input){
        int max = 0;
        for(int val:input){
            if(val>max){
                max = val;
            }
        }
        return max;
    }

    public int calculate(char sign, int x, int y) {
        switch (sign){
            case '+' :
                return(addition(x,y));
            case '-' :
                return(minus(x,y));
            case '*' :
                return(multiply(x,y));
            case '/' :
                if (y == 0){
                    throw new ArithmeticException("Division by zero is impossible!");
                }
                return(division(x,y));
        }
        return 0;
    }
}