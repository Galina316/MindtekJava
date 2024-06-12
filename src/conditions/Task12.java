package conditions;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        // keep asking a user to enter positive number
        // until they enter negative value

        Scanner in = new Scanner(System.in);
        System.out.println(" If u enter negative number it will be the end");
        while(true){System.out.println("Enter  number: ");
            int num = in.nextInt();
            if(num<0)break;


    }
        System.out.println("The end");}



}
