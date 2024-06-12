package projectday;

import java.time.MonthDay;
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week ");
        String day = input.next();
        if (day.equals("Monday")|| day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")|| day.equals("Friday"))
            System.out.println("This a week day");
    }
}
