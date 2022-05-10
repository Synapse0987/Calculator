import java.util.HashMap;

public class hashMap {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<String, Integer>();
        students.put("John", 20);
        students.put("Sally", 21);
        students.put("Michael", 20);
        students.put("Paul", 24);
        for (String i : students.keySet()){
            System.out.printf("%s is %d year old \n", i, students.get(i));
        }
    }
}
