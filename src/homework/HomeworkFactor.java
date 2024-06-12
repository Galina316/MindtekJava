package homework;

import java.util.Scanner;

public class HomeworkFactor {
    public static void main(String[] args) {
        //. Create a class with main method, ask a user to type a number between 1 and 10.
        //write an algorithm that calculates the factorial of a given number:
        //Research what factorial means first.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int factNum = 1;
        int num = in.nextInt();
        if(num<0){
            System.out.println("Invalid number ");
        }else {
            while (true){
                int i =1;
                if(i<=num){
                i++;
                factNum = factNum*i;
            }
                System.out.println("Factorial of "+num+" is: "+factNum);
            }
        }

    }
}
