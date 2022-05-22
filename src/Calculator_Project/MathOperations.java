package Calculator_Project;

import java.util.ArrayList;

public class MathOperations{
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
    public int CompareValue(ArrayList<Integer> input){
        int max = 0;
        for(int val:input){
            if(val>max){
                max = val;
            }
        }
        return max;
    }
}