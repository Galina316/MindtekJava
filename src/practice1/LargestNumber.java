package practice1;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        //Then write a program that asks user to enter
        //three numbers, and program prints the largest
        //number.
        //2.
        //Like below:
        //Enter three numbers:
        //5
        //6
        //1
        //Greatest number is 6

        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter a number1: ");
        int num = input.nextInt();
        max= num;
        System.out.println("Enter a number2: ");
        int num1 = input.nextInt();
        if(num1>max) max = num1;
        System.out.println("Enter a number3: ");
        int num2 = input.nextInt();
        if (num2>max) max = num2;
        System.out.println("Greatest number is "+ max);





    }
}

