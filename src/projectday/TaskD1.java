package projectday;

import java.util.Scanner;

public class TaskD1 {
    public static void main(String[] args) {
        //Create a SwapLetters class with main method. Write a
        //code that will accept a word as input from user and will
        //swap first and last letter in word. Cases will be printed all
        //lower case. Like below:

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.next().toLowerCase();
        //char first =word.charAt(0);
        //char last = word.charAt(word.length()-1);
        //(word.replace(last,first) (word.replace(first,last));
        int num = word.length();
        System.out.println(word.charAt(num-1)+word.substring(1,num-1)+word.charAt(0));


         }
    }

