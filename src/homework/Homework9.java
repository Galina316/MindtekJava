package homework;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        //Create a class with a main method. Ask a user to enter any number in a range of 0 - 500.
        // Calculate the sum of all number starting from 0 to the given number.
        // For example if a given number is 5 you should find a sum of 0+1+2+3+4+5 = 15;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number from 0 to 500");
        int num = in.nextInt();
        int sum =0 , sum2=0;
        if(num>=1&&num<=500) {
            while (sum2 < num) {
                sum2++;
                sum += sum2;
            }System.out.println("total sum of numbers from 0 to "+num+" is: "+sum);
        }else System.out.println("Invalid number");
    }
}
