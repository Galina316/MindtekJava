package homework1;

public class TestValidAge {
    public static void validateAge(int age){
        if(age>=0 && age<=150){
            System.out.println("Valid age");
        }else{
            throw new InvalidAgeException("Invalid age: "+age);
        }
    }

    public static void main(String[] args) {
        Exception exception = new Exception();
        System.out.println();
    }
}
