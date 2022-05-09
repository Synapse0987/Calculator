abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Oink oink!");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Woof woof!");
    }
}

class Main2{
    public static void main(String[] args){
        Dog myDog = new Dog();
        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();
        myDog.animalSound();
    }
}