package string;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Initial Creator
        // aska user to enter first name, enter last name
        // print initials of that person

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String firstName = in.next().trim().toUpperCase();
        //if(firstName.isEmpty()) System.out.println("The given name is empty");
        System.out.println("Enter your last name");
        String lastName = in.next().trim().toUpperCase();
        System.out.println("Your Initials is : "+firstName.charAt(0)+lastName.charAt(0) );

    }
}
