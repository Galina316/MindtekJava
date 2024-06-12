package projectday;

import java.util.Scanner;

public class Grading {
    //Do you know Java? (Enter 1 for Yes and 2 for No)
    //1
    //How many percent is your attendance? (0-100)
    //80
    //Did you finish all assignments? (Enter 1 for Yes and 2 for No)
    //1
    //It is time to learn Selenium
    //** If one of the answers is No or attendance is below 80 then print ‘Practice Java’ otherwise print
    //‘It is time to learn Selenium’.
    //Task E
    //Grading
    //Write a program that asks user to enter number of month. Based on season of entere

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java 1 -> yes 2 -> no ");
        int q1 = input.nextInt();
        System.out.println("How many percent is you attendance from 0-100");
        int q2 = input.nextInt();
        System.out.println("Did you finish all assignments? 1 -> yes 2 ->no ");
        int q3 = input.nextInt();
        boolean answer = q1==1;
        boolean answer1 = q2>=80;
        boolean answer2 = q3 ==1;
        if (answer && answer1 && answer2) System.out.println(" IT is time to learn Selenium ");
        else System.out.println("Practice Java");



    }
}
