package homework;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        //3. Write a program that asks a user to enter a number.
        // If entered number is even number and it is between 0 and 100 then program prints
        // 'Valid number', otherwise 'Invalid number'.

        System.out.println("Enter a even number between 0 and 100: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean valid = num%2==0;
        boolean valid1 = num<=100;
        boolean valid3 = num>0;
        if (valid==true && valid1==true && valid3==true)

            System.out.println("Valid number "  );
        else
        System.out.println("Not Valid ");

        }



    }





