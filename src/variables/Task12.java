package variables;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // ask a user to enter 4 numbers
        // print: Sum of even numbers: x
        // Print: sum of odd numbers : y
        // ex; 3,4,5,6

        Scanner input = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;
        System.out.println("Num1: ");
        int num = input.nextInt();
        boolean isEven = num%2==0;
        if (isEven) evenSum+=num; //evenSum = evenSum
        else oddSum += num;

        System.out.println("Num2: ");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if (isEven) evenSum+=num;
        else oddSum += num;
        System.out.println("Num3: ");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if (isEven) evenSum+=num;
        else oddSum += num;
        System.out.println("Num4: ");
        num = input.nextInt();
        isEven = num % 2 == 0;
        if (isEven) evenSum+=num;
        else oddSum += num;
        System.out.println("Total even is "+ evenSum);
        System.out.println("Total of odds is : "+ oddSum);




    }
}
