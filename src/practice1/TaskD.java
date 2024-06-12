package practice1;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {

        //Write a program that asks user to enter the day of the week, then print ‘It is Week day’ if the day
        //is Monday, Tuesday, Wednesday, Thursday, and Friday. For Saturday and Sunday print ‘It is
        //Weekend’. (use ‘
        //==
        //’ operator to compare String values

        Scanner input = new Scanner(System.in);
        System.out.println("Enter day of the week ");
        String day = input.next();
        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday"))
            System.out.println("This is a week day");
        if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) System.out.println("This is a weekend");






    }
}
