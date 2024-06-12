package projectday;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int side1 = input.nextInt();
        System.out.println(" Enter the width of rectangle ");
        int side2 = input.nextInt();
        System.out.println("The perimeter of rectangle is:  "+(2*(side1+side2)));
        System.out.println("The area of rectangle is is : "+ (side1 * side2));


    }
}
