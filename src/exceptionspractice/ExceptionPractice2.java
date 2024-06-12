package exceptionspractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        boolean isException = false;
        do {
            try{
                Scanner in = new Scanner(System.in);
                System.out.println("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                int result = num1 / num2;
                System.out.println("Division of two numbers equals to " + result);
               isException= false; //break;
            } catch (ArithmeticException | InputMismatchException| NullPointerException exception) {
                System.out.println(exception.getMessage());
                isException= true;
                if(exception.getMessage().equalsIgnoreCase("/ by zero")){
                    System.out.println("Number 2 can't be 0");
                }
            }
        }while(isException);
    }
}
