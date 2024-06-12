package conditions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // find total amount of vowel letter from given string

        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();
        int index = 0;
        int count = 0;
        while(index<text.length()){
            char letter = text.charAt(index);
            boolean isVowel = letter == 'a'|| letter == 'e'|| letter == 'u'|| letter == 'i'|| letter == 'o';
            if(isVowel)count++;
            index++;

        }
        System.out.println(" Total amount of vowels : "+count);
    }
}
