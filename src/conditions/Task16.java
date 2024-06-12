package conditions;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //ask a user enter a word then constract a new word by puting * after every letter

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();
        String res = "";
        //if(word<=word.length()){
        int i =0;
        while(i<word.length()){
            res=res+(word.charAt(i++)+"*");
            System.out.println(res);

    }

    }
}
