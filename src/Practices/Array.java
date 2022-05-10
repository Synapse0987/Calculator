import java.util.ArrayList;

public class Array {

    public static void main(String[] args){
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(100);
        cars.add(20);
        cars.add(30);
        cars.add(50);
        int sum =0;
        for(int no :cars){
            sum = sum+no;
        }
        System.out.println(sum);
    }
}
