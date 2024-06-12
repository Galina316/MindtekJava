package practice1;

import java.util.Scanner;

public class WordToSum {
    public static void main(String[] args) {
        // need to find sum of entered word
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();
        int sum = 0;
        for(int i = 0; i<word.length();i++){
        sum = sum + word.charAt(i);

    }System.out.println("Total sum of this word is : "+sum);
    }

}
