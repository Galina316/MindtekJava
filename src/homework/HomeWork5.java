package homework;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        //In a main class, keep asking a user to enter numbers until they type "Exit".
        //Print the total sum of all entered numbers.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and type Exit when finish ");
        int sum = 0;
        String word = in.next();
        while (!word.equalsIgnoreCase("Exit")) {
            sum = sum + Integer.parseInt(word);
            System.out.println("Enter a number ");
            word=in.next();
            }
        System.out.println("The total sum is: "+sum);
        }

    }