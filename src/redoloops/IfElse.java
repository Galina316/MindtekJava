package redoloops;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your age");
        int age = in.nextInt();
        //young (age<13), 13<=age<=19   teen, 19<age<60 adult. age>60 senior

        if (age > 0) {
            if (13 <= age && age <= 19) {
                System.out.println("Teen");
            } else if (age <= 13) {
                System.out.println("young");
            } else if (age > 19 && age < 60) {
                System.out.println("Adult");
            } else if (age > 60) {
                System.out.println("Senior");
            }
        }else System.out.println("invalid age");
    }
}
