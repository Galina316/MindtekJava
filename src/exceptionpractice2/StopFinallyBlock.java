package exceptionpractice2;

public class StopFinallyBlock {
    public static void main(String[] args) {
        try{
            int num=5/0;
            System.out.println(num);
            //System.exit(0); and
            // return - will stop the method after finally
           // being executed
            System.exit(0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In finally block");
        }
        System.out.println("After try catch and finally");
    }
}
