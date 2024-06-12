package homework;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        //Write a program that will accept dollars as entry and
        //then print how much it will make in quarters, dimes,
        // nickels and pennies.
        //Example:
        //Please enter your change:
        //2.66
        //$2.66 will make 10 quarters 1 dimes 1 nickels and 1 pennies

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your change: ");
        double num1 = input.nextDouble();
        double quater = (num1/25)*100;
        double dimes = ((num1/10)*100)-quater;
        double nickels = ((num1/5)*100)-quater-dimes;
        double pennies = (((num1/100)*100)-quater-dimes-nickels);
        System.out.println("Your change is : "+ (quater)+(" quaters ")+(dimes)+(" dimes ")+(nickels)+(" nickels ")+(pennies)+(" pennies "));
    }
}
