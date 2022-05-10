public class Main {
    int modelYear;
    String modelName;

    public void introduction(int year, String model){
        modelYear = year;
        modelName = model;
        System.out.println(String.format("This is my %s and its built in %s", modelName, modelYear));
    }

    public static void main(String[] args){
        Main myCar = new Main();
        myCar.introduction(1995, "Mustang");
    }
}
