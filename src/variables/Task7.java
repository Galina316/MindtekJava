package variables;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Even vs Odd");
        //ask a use to enter any integer
        // is given num is even print "Even", otherwise print "Odd"
        System.out.println("Enter a number pls");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println("Even"+(num%2 == 0) );
        } else {
            System.out.println("Odd ");
        }

    }
}
