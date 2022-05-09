public class ExceptionsCatch {
    public static void main(String[] args){
        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[2]);
        }
        catch (Exception e){
            System.out.println("Whoops, something went wrong");
        }
        finally {
            System.out.println("I am done");
        }

    }
}
