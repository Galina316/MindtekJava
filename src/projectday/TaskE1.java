package projectday;

import java.util.Scanner;

public class TaskE1 {
    public static void main(String[] args) {
        //Write a program that asks user to enter a word and program prints middle character(s)
        //of word. If number of letters in word is odd number then it prints single middle
        //character, otherwise two middle characters.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word ");
        String word = in.next();
        int n = word.length();
        if(n%2==1) System.out.println(word.charAt(n/2));
        if(n%2 ==0) System.out.println(""+ word.charAt(n/2-1)+word.charAt(n/2));


    }
}
