package homework1.exception;

public class TestValidAge {
    public static void validateAge(int age){
        if(age>=0 && age<=150){
            System.out.println("Valid age");
        }else{
            throw new InvalidAgeException("Invalid age: "+age);
        }
    }

    public static void main(String[] args) {
       try{
           TestValidAge.validateAge(15);
           TestValidAge.validateAge(155);
       }catch (InvalidAgeException e){
           System.out.println("Error : "+e.getMessage());
       }
    }
}
