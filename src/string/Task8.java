package string;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //find the total amount of Vowel letters in given word
        // ask a user to enter a word with length of 4
        //if length is not 5 do nothing but print Invalid word
        // if length is 5 , then print reversed version of given word
        // vowel a e i o u

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word length of 5 ");
        String word = in.next().toLowerCase();
        if (word.length() == 5) {
        int count = 0;
        int index = 0;
        char letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o') count++;
            letter = word.charAt(index++);
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'o') count++;
            System.out.println(count + " vowels found");
        }   else System.out.println("Invalid length");


    }
}
