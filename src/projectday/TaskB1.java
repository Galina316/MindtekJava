package projectday;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        //1. Create a GenerateEmail class with main method.
       // Write a program that asks a user for first name, last name, and company,
        // then it generates email for user.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String firstName = in.next();
        System.out.println(" Enter you last name ");
        String lastName = in.next();
        System.out.println("Enter your company name ");
        String company = in.next();
        System.out.println("Your email is:  "+firstName.charAt(0)+"."+lastName+"@"+company+".com");

    }
}
