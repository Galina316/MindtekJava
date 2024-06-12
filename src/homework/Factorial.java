package homework;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a class with main method, ask a user to type a number between 1 and 10.
        //write an algorithm that calculates the factorial of a given number:
        //Research what factorial means first.

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a number in range 1 to 10 ");
        int factorial = 1;
        int num = in.nextInt();
        if(num<0 && num<=10){
            System.out.println("Invalid number ");
        }else{
            for (int i =1; i<=num;i++){
                factorial=factorial*i;
            }
            System.out.println("Factorial of "+num+" is: "+factorial);
        }



    }
}
