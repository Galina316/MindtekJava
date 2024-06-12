package homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
       //1. Create a class with main method.
        //2. Create a scanner.
        //3. Write a program that will ask from user to enter the grade in scale of 100,
        // and program will print grade in letter.
        // (80 – 100 is A, 60 – 79 is B, 40 – 59 is C, 0 - 39 F)

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the grade in scale of 100 ");
        int num = in.nextInt();
        if(num>=80 || num==100) System.out.println("Your score grade is A");
        if(num>=60 && num<=79) System.out.println("Your score grade is B");
        if(num>=40 && num<=59) System.out.println("Your score grade is C");
        if(num>=0&&num<=39 ) System.out.println("Your score grade is F");
        //else System.out.println("Incorrect score scale");
    }
}
