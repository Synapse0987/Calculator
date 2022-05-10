public class enumPractice {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        for(Level myVar: Level.values()){
            System.out.println(myVar);
            switch (myVar){
                case LOW:
                    System.out.println("It's low");
                    break;
                case MEDIUM:
                    System.out.println("It's medium");
                    break;
                case HIGH:
                    System.out.println("It's high");
                    break;
            }
        }
    }
}
