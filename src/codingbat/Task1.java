package codingbat;

import java.util.Scanner;

public class Task1 {
    //Given a string, return a string where for every char in the original, there are two chars.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();
        int i =0;
        String res = "";
        while(i<word.length()){
            char letter = word.charAt(i);
            res = res+letter+letter;
            i++;
        }
        System.out.println(res);

    }
}
