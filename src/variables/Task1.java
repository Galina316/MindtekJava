package variables;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //ask a use to enter 2 intiger numbers
        // then print + sum of given numbers
        // Ex: type number: 4
        //  type number: 6
        // + 10
        // implementation:
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: "+ sum);

        System.out.println("Enter a number: ");
        int num3 = input.nextInt();
        System.out.println("Enter a number: ");
        int num4 = input.nextInt();
         int result = num3 * num4;
        System.out.println("Multiplication: " + result);

        System.out.println("end!");
    }
}
