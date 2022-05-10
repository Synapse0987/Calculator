public class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(2021, "Honda");
        System.out.println(String.format("This is my %s and its built in %s", myCar.modelName, myCar.modelYear));
    }
}
