package homework;

import javax.swing.text.StyledEditorKit;
import java.io.OutputStream;
import java.util.Scanner;

public class Discussion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! What is your name?");
        String name = input.next();
        System.out.println("Nice to met you, " + name);
        System.out.println("What do you do " + name+ " ?");
        String job = input.next();
        System.out.println("So you are "+ job);
        System.out.println("How many day a week you work?");
        int days = input.nextInt();
        System.out.println("How many hours you work daily? ");
        int hours = input.nextInt();
        System.out.println("So you work weekly " + (days*hours) + "hours.");





    }
}
