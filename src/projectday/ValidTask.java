package projectday;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidTask {
    public static void main(String[] args) {

        //Write a program that asks user to enter the name. If name
        //has 2 or more than 2 characters then print ‘Valid Age’
        //otherwise print ‘Invalid Age’

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.next();
        boolean validName = name.length()>2;
        if(validName) System.out.println("Valid age");
        else System.out.println("Invalid age");
    }

}
