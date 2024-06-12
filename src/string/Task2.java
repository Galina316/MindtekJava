package string;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //ask a user to enter any word
        //if the first and the last char are the same:
        // then print : "First and last char are same"
        // otherwise print "First and last char are different"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word ");
        String word = input.nextLine();
        int firstIn = 0;
        int lastIn = word.length()-1;
        char firstChar = word.charAt(firstIn);
        char lastChar = word.charAt(lastIn);
        if(firstChar==lastChar) System.out.println("Same");
        else System.out.println("different");


    }
}
