package projectday;

import java.util.Scanner;

public class BalanceBank {
    public static void main(String[] args) {
        //What is your bank balance?
        //100
        //Enter the price of oranges?
        //2.25
        //Enter how many pounds you want to buy?
        //4
        //Your transaction amount is $9
        //Your account’s new balance is $91

        Scanner in = new Scanner(System.in);
        System.out.println("what is your bank balance");
        int balance = in.nextInt();
        System.out.println("Enter the price of oranges");
        double price = in.nextDouble();
        System.out.println("Enter how many pounds you want to buy");
        int pounds = in.nextInt();
        double sum = price*pounds;
        System.out.println("your transaction amount is: "+ sum);
        System.out.println("Your new balance is: "+ (balance-sum));
    }
}
