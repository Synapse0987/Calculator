import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFunction {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(90);
        numbers.add(12);
        numbers.add(15);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            int i = it.next();
            if(i < 20) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
