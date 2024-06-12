package homework;

import java.util.Scanner;

public class Destination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter distance in miles: ");
        double miles = input.nextDouble();
        System.out.println("That makes: " + (miles *1.609344)+ " km");
    }
}
