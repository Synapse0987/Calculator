import java.util.Scanner;

class UserInput {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age and salary");
        String userName = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        System.out.printf("Welcome %s, your age is %d and your salary is %.2f", userName, age, salary);
    }
}
