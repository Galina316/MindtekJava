package conditions;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        //print total amount of vowel and non-vowels
        Scanner in = new Scanner(System.in);
        System.out.println("Type a word");
        String word = in.next();
        int vowCounter = 0;
        for(int i =0; i<word.length();i++){
            char letter = word.charAt(i);
            boolean isVowel = letter=='a'||letter=='e'||letter=='i'||letter=='u'||letter=='o';
            if(isVowel)vowCounter++;


    }System.out.println("Sum of vowel is "+vowCounter);
       System.out.println("Sum of non vowels is "+(word.length()-vowCounter));
}
}
