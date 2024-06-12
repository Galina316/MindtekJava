package practice1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        //Then write a program that asks user to enter
        //three numbers, and program prints the largest
        //number.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        int max = 0;
        System.out.println("Enter number 2");
        int num2 = input.nextInt();
        System.out.println("Enter number 3");
        int num3 = input.nextInt();
        if (num1>0) max=num1;
        if (num2>num1) max=num2;
        if (num3>num2) max=num3;
        System.out.println("The largest number is : "+max);




    }
}
