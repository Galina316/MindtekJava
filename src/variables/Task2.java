package variables;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double breadPrice = 3.44;
        System.out.println("The price of bread is $" + breadPrice);
        System.out.println("How much are you going to pay?");
        // if customer pays 5 then change is $1,66
        // if customer pays 10 then change is $6,66

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int givenMoney = input.nextInt();
        double change = givenMoney - breadPrice;
        System.out.println("Your change is $" + change);


        }

    }

