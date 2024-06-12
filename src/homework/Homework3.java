package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Ask a user to enter 5 integers. Print the minimum number, the maximum number, the total sum.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 numbers ");
        int max = 0;
        int min =0;
        int num1 = in.nextInt();
        if(num1>max) max=num1;
        if(num1<min) min=num1;
        int num2 = in.nextInt();
        if(num2>num1) max = num2;
        if(num2<num1) min=num2;
        int num3 = in.nextInt();
        if(num3>num2) max=num3;
        if(num3<num2) min=num2;
        int num4 = in.nextInt();
        if(num4>num3) max=num4;
        if(num4<num3) min=num4;
        int num5 = in.nextInt();
        if(num5>num4) max=num5;
        if(num5<num4) min=num5;
        if(num1>=max || num2>=max || num3>=max ||num4>=max || num5>=max)
        System.out.println("Max number is: "+ max);
        if(num1<=min || num2<=min || num3<=min ||num4<=min || num5<=min)
            System.out.println("Minimum number is: "+min);
        System.out.println("Total sum is: "+(num1+num2+num3+num4+num5));


    }
}
