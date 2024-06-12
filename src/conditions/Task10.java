package conditions;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // keep asking a user to enter any number until they enter 55

        Scanner in = new Scanner(System.in);
        int num = 0;
        while(num != 55){
            System.out.println(" I will keep asking numbers until u enter 55");
            System.out.println("Enter any number ");
            num = in.nextInt();
        }
        System.out.println("The end");


    }
}
