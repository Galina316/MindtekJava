package variables;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Age finder!");
        // ask a use what year they born: 2011
        // print: You should be x years old

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your year of born");
        int year = input.nextInt();

        System.out.println( "Your age is " +  (2024-year));


    }
}
