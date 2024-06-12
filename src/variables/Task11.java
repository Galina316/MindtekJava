package variables;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //ask a use to enter 4 numbers -. 5,2,1,3 -> total:
        //print the total sum of those of the given numbers

        Scanner input = new Scanner(System.in);
        int sum =0;
        System.out.println(" Enter 4 numbers");
        System.out.println("Num1: ");
        int num = input.nextInt();
        sum = sum + num;
        System.out.println("Num2: ");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Num3: ");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Num4: ");
        num = input.nextInt();
        sum = sum + num;
        System.out.println("Total: "+ sum);

    }
}
