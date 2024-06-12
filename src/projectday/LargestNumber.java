package projectday;

import java.util.Scanner;


     public class LargestNumber {
         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=0;
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
         max = num1;
        if (num1>max) max = num1;
        if (num2>max) max = num2;
        System.out.println("Maximum : "+max);



    }
}
