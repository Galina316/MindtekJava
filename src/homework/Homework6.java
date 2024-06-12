package homework;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        //Create a class with main method and scanner
        //2. Write a program that will ask from user to enter a number. Then program will print
        // sum of all odd numbers between 0 and entered number.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = in.nextInt();
        int sum = 0;
        while (num>=1) {
            if (num%2!=0) sum = sum+num;
            num--;
        }
        System.out.println("Total sum of odd numbers is: " + sum);

    }
}
