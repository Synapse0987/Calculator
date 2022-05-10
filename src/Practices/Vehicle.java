public class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Honk honk!");
    }
}

class Cars extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args){
        Cars myCar = new Cars();
        myCar.honk();

        System.out.printf("%s %s", myCar.brand, myCar.modelName);
    }
}