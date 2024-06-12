package variables;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Square area and perimeter calculator");
        // ask a user to enter length of a square (int)
        // print calculated area and calculated perimeter
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length ");
        int length = input.nextInt();
        int area = length * length;
        int perimeter = length * 4;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is "+ perimeter);

    }
}
