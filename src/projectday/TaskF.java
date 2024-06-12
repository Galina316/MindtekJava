package projectday;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month = input.nextInt();
        boolean isWinter = month==12||month==1||month==2;
        boolean isSpring = month==3||month==4||month==5;
        boolean isSummer = month==6||month==7||month==8;
        boolean isFall = month==9||month==10||month==11;
        if (isWinter) System.out.println("Season is winter ");
        if (isSpring) System.out.println("Season is spring");
        if (isSummer) System.out.println("Season is summer");
        if (isFall) System.out.println("Season is fall");



    }
}
