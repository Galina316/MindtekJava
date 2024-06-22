package Interviewcoding.Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseSentence3 {
    public static void main(String[] args) {
        String str = "I like USA";
        String reversed = reverseSentence(str);
        System.out.println(reversed); // Output: "A SUek ekil I"
    }

    public static String reverseSentence(String str) {
        // Split the string into words, reverse each word, and collect them back

        return Arrays.stream(str.split(" "))
                .map(ReverseSentence3::reverseWord)
                .collect(Collectors.joining(" "));
    }

    public static String reverseWord(String word) {
        // Reverse the characters of the word using StringBuilder
        return new StringBuilder(word).reverse().toString();
    }
}


