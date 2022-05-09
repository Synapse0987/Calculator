import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Toyota");
        System.out.println(cars);
    }
}
