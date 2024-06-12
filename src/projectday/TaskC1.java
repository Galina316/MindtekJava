package projectday;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TaskC1 {
    //Write a program that asks a user to enter a number. If number can evenly be divided by 3,
    //then program prints
    //"Fizz
    //". If number can evenly be divided by 5, then program prints
    //"Buzz
    //".
    //If number can evenly be divided by 3 and 5 at the same time, then program prints
    //"FizzBuzz
    //".
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if (num%3 ==0 && num%5 == 0) {
            System.out.println("FizzBuzz");
        }else if(num%3 == 0){
            System.out.println("Fizz");
        }else if (num%5 ==0){
            System.out.println("Buzz");

        }else System.out.println("Given number is not divided by 3 and 5");
    }



}
