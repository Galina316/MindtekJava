package variables;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // ask a use to enter 3 ints
        // print the tota; count of positive ints
        // print the total count negative ints
        // ex: 123 -> pos : 3 neg : 0
        // 1 -2 3 -> pos 2: neg : 1

        System.out.println("Num1 :");
        int posCount=0,negCount=0;
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num>0) posCount++; // posCount + posCount +1;
        //else negCount++;

        System.out.println("Num2 :");
        num = input.nextInt();
        if (num>0) posCount++; // posCount + posCount +1;
        //else negCount++;

        System.out.println("Num2 :");
        num = input.nextInt();
        if (num>0) posCount++; // posCount + posCount +1;
        //else negCount++;
        System.out.println("count of positives: "+posCount);
        System.out.println("count of negatives: "+ (3-posCount));



    }
}
