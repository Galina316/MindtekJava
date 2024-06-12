package conditions;

import java.util.Scanner;

public class Task8Palindrome {
    public static void main(String[] args) {
        //find if the text is palindrome?
        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();
        int index = text.length()-1;
        String rev = "" ;
        while(index >=0){
            rev = rev + text.charAt(index);
            index--;
        }
           if (text.equals(rev)) System.out.println("The word is polindrome ");
           else System.out.println(" the word is not polindrome ");


    }
}
