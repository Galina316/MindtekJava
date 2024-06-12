package string;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // ask a user to enter any word
        //ask a user to enter one single letter
        // find out if the given letter is unique
        // if unique print the given letter is unique
        // if not unique print the given letter is not unique

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = in.nextLine().toLowerCase();
        System.out.println("Which letter to check");
        String letter= in.next().toLowerCase();
        if(word.contains(letter)) {
            if (word.indexOf(letter) == word.lastIndexOf(letter)) System.out.println("Unique");
            else System.out.println("Not unique");
        }else System.out.println("No such letter");

    }
}
