package homework;

import java.util.Scanner;

public class MaxMinNumber {
    //Create main method with Scanner.
    //3. Write a program that will ask from user
    // to enter 3 numbers and program will print the
    // largest number and the lowest number.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int max=0,min=0;
        int num = input.nextInt();
        if(num>0) max=num;
        if (num!=0)min=num;

        System.out.println("Enter number 2 : ");
        int num1 = input.nextInt();
        if (num1>num) max=num1;
        if (num1!=0) min=num1;

        System.out.println("Enter number 3 : ");
        int num2 = input.nextInt();
        if (num1<num2) max=num2;
        if (num2!=0) min=num2;


        System.out.println("The max number is "+ max);
        System.out.println("The min number is "+ min);










    }
}
