import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args){
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            myNum.add(i);
        }
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        myNum.forEach(method);
    }
}
