package string;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //ask a user to enter a word with length of 4
        // if length is not 4 do nothing but print Invalid word
        // if length is 4 , then print reversed version of given word
        //ex: java -> avaj
        //hell -> lleh
        // mouse -. invalid word

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word length of 4 ");
        String word = in.next().toLowerCase();
        if(word.length()!=4) System.out.println("Invalid");
        if(word.length()==4) System.out.println("Word reversed " + word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
    }
}
