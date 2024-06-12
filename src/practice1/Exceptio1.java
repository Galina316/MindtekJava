package practice1;

public class Exceptio1 {
    public static void main(String[] args) {
        String str = "Java";
        try{
        System.out.println(str.charAt(5));
    }catch(StringIndexOutOfBoundsException e){
            System.out.println("There was an exception.");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the code");
    }

}
