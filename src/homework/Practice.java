package homework;

import variables.ScannerIntro;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //Create a LargestNumber class with main method,
        //Then write a program that asks user to enter two
        // numbers, and program prints the largest number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max = num1;
        if (num1 >=num2) max = num1;
        if (num2>=num1) max = num2;
        System.out.println("Largest number is : "+ max);



    }
}
