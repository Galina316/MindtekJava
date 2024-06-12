package practice1;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        //Write a program that asks to enter two int numbers and String as operator, then print
        //correct calculation of two numbers for entered operator.
        //Operators: + - * /
        //(use ‘
        //==
        //’ operator to compare String values)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String operator = input.next();
        if(operator.equals("+")) System.out.println(num1+num2);
        if(operator.equals("-")) System.out.println(num1-num2);
        if(operator.equals("*")) System.out.println(num1*num2);
        if(operator.equals("/")) System.out.println(num1/num2);



    }
}
