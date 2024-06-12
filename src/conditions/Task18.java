package conditions;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        // keep asking a user to enter a word until exit
        // ask which char they want to put after every letter and print the word

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word");
            String word = in.next();
            System.out.println("Enter char: 1-# 2-*");
            String onechar= "#",twochar="*";
           int chosenchar = in.nextInt();
            if(word.equals("exit"))break;
            String res ="";
            int i =0;
            while(i<word.length()){
                res=res +word.charAt(i)+chosenchar;
                i++;
            }
            System.out.println(res);

        }System.out.println("The end");
    }
}




