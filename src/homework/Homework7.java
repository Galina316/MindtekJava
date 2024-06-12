package homework;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        //Ask for an input from a user and find out if a given word is a palindrome or not.
        //You can continue the class we already started :
        //
        //public class Palindrome {
        //public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Type any text: ");
        //String word = input.nextLine();
        //
        //// radar, racecar, mom, rotator -> This word is a palindrome
        //// water, table, computer -> This word is not a palindrome

        Scanner input = new Scanner(System.in);
        System.out.println("Type any text: ");
        String word = input.nextLine();
        int i = word.length()-1;
        String reverse = "";
        while (i>=0){
            reverse = reverse + word.charAt(i);
            i--;


    }if(word.equalsIgnoreCase(reverse)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");
}}
