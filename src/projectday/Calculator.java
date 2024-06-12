package projectday;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Write a program that asks to enter two int numbers and String as operator, then print
        //correct calculation of two numbers for entered operator.
        //Operators: + - * /
        //(use ‘
        //==
        //’ operator to compare String values)
         // String operator=input.next();
        // if(operator.equals("+"))
        /*
        Enter two numbers and operator:
        3
        5
        *

        if(operator.equals("+")) System.out.println(num1+num2);
        if(operator.equals("-")) System.out.println(num1-num2);
        if(operator.equals("*")) System.out.println(num1*num2);
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator ");
        int num = input.nextInt();
        int num1 = input.nextInt();
        String operator = input.next();
        if (operator.equals("+")) System.out.println(num1+num);
        if (operator.equals("-")) System.out.println(num-num1);
        if (operator.equals("*")) System.out.println(num*num1);
        if (operator.equals("/")) System.out.println(num/num1);

    }
}
