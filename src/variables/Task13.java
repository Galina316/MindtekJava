package variables;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        //ask a user to enter 3 numbers
        //print sum of positive num
        //print sum of negative nums
        //1,-2,-4 -> PosSum: 1 NegSum: -6

        System.out.println("Num1: ");
        int posSum = 0, negSum = 0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPos = num>0;
        if(isPos) posSum+=num;
        else negSum+=num;

        System.out.println("Num2: ");
        num = input.nextInt();
        if(isPos) posSum+=num;
        else negSum+=num;

        System.out.println("Num3: ");
        num = input.nextInt();
        if(isPos) posSum+=num;
        else negSum+=num;

        System.out.println("Sum of positives is : "+ posSum);
        System.out.println("Sum of Negatives is : "+ negSum);


    }
}
