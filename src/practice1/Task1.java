package practice1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //ask a user to enter a word with length of 3
        //count how many letter "a" in total in given word
        // total sum of letter a in son is 0

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word with length of 3");
        String word = in.next();
        char count = 0;
        if(word.charAt(0)=='a') count++;
        if(word.charAt(1)=='a') count++;
        if(word.charAt(2)=='a') count++;
        System.out.println("Total a in " +word +" is " + count);
    }
}
