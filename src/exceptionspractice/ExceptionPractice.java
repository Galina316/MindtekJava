package exceptionspractice;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str = "Java";
        try {
            System.out.println(str.charAt(5));
        } catch(StringIndexOutOfBoundsException exception){
            System.out.println("There was an exception");
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());

        }catch(NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getClass());
        }
        System.out.println("End of code");

    }
}
