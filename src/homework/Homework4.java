package homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //1. Create a class with main method and Scanner
       // 2. Write a program that asks a user to enter any word
        // and number of characters that program should print.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = in.next();
        System.out.println("Enter number of characters: ");
        int num = in.nextInt();
        if(num<=word.length())   System.out.println(word.substring(0, num));
        if(num>=word.length()) {System.out.println("Word doesn't have "+num+" characters");

        }

    }
}
