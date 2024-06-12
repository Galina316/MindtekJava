package conditions;

import java.util.Scanner;

public class Class13 {
    // print the total sum of all positive numbers

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Type a number: ");
            int num = in.nextInt();
            if(num>0) sum=sum+num;

            if(num<0)break;

        }System.out.println("Total sum of positive numbers is : "+sum);
        System.out.println("The end");
    }
}
