package conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // print every letter in a single new line
        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();

        int index =0;
        while(index<text.length()){
            System.out.println(text.charAt(index));
            index++;

        }



    }
}
