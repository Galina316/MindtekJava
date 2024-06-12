package practice1;

import java.util.Scanner;

public class AndPractice {
    public static void main(String[] args) {
        boolean isGreen = true;
        boolean noOneCrossing = true;
        if(isGreen && noOneCrossing) System.out.println("You can go ");
        else System.out.println("Wait!");

        System.out.println("Book club for people between 25-35");//age >=25 age=< 35
        System.out.println("How old are you? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        boolean num1 = age>=25 && age<=35;
        if(num1) System.out.println("You can apply");
        else System.out.println("You can not apply, sorry");



    }

}
