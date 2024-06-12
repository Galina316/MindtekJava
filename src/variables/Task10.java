package variables;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Maximum finder");
        // ask a use to enter 3 intigers.Print the maximum one
        //12,1,6 -> the max is : 12
        int max =0;
        System.out.println("Enter number ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        max = num1;

        System.out.println("Num2: ");
        int num2 = input.nextInt();
        if (num2>max) max =num2;
        System.out.println("Num3: ");
        int num3 = input.nextInt();
        if(num3>max) max =num3;
        System.out.println("Maximum: "+ max);

    }
}
