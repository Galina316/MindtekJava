package homework;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //1. Create a class with main method and Scanner
        //2. Write a code where program will ask from user to enter a letter,
        // and program will print Vowel if letter is vowel otherwise Consonant.
        // (Vowel letters: a, e, u, i, o, A, E, U, I, O)

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter");
        String userLetter = in.next().toLowerCase();
        char letter = userLetter.charAt(0);
        if(letter=='a'|| letter=='o'|| letter=='u'|| letter=='o'|| letter=='e'|| letter=='i')
            System.out.println("Vowel");
        else System.out.println("Consonant");

    }
}
