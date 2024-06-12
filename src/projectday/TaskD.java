package projectday;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        //Write a program that asks user to enter two integers and program should print
        //multiplication of two numbers if they are equal, if they are not equals program should print
        //the sum of two numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Total is :" + (num1 * num2));
        } else {
            System.out.println("Total is :" + (num1 + num2));
        }
    }
}









