package variables;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("KM to MILE converter");
        // ask a use to enter km, print that amount in miles
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KM amount:");
        double km = input.nextDouble();
        double miles = km * 0.62137;
        System.out.println(miles);
    }
}
