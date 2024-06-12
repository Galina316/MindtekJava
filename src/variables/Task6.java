package variables;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Check your eligibility to apply for Driver License");
        //ask a use what year they were born
        // calculate their age
        // if age >= 16 print "You are eligible"
        // else print "Sorry not yet"
        Scanner input = new Scanner(System.in);
        System.out.println("What year you born? ");
        int age = input.nextInt();
        System.out.println("Your age is "+(2024-age));
        if (age>=16) {
            System.out.println("You are eligible");
        }
        else {
                System.out.println("Sorry not yet");
            System.out.println("You can come in "+( 16-age)+ " years");
        }
    }
}
