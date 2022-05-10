abstract class abstractCase {
    public String fname= "John";
    public int age = 24;
}

class Student extends abstractCase {
    public int graduationYear = 2022;
    public void study() {
        System.out.println("Studying to score man");
    }
}

class Second{
    public static void main(String[] args){
        Student stud = new Student();
        System.out.printf("%s is %s year old and he will graduate in %s.%n", stud.fname,stud.age,stud.graduationYear);
        stud.study();
    }
}
