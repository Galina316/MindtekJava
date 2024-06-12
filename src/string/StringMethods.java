package string;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        //.indexOf('a'); as a param give one char, return back int
        //             01234567
        String word = "universe";
        System.out.println(word.indexOf('e'));
        System.out.println(word.lastIndexOf('e'));

        // contains method            its is boolean
        System.out.println(word.contains("se"));

        // equals:
        System.out.println(word.equals("university"));
        System.out.println(word.equalsIgnoreCase("UnIverse"));

        //startsWith:
        System.out.println(word.startsWith("uni"));
        System.out.println(word.endsWith("e"));

        // trim
        String name = "  Jack  Smith  ";
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name.trim().length());

        //chaining
        String el = "  java   ";
        // make sure all letters uppercase
        // ,remove empty space from both sides and find if the length of trimmed
        //el is even?

       // el = el.toUpperCase(Locale.ROOT);
       // el = el.trim();
       // int length = el.length();
        //boolean isEven = length%2==0;
        //if(isEven) System.out.println("Length is even");
       // else System.out.println("Length is Odd");

        if(el.toUpperCase().trim().length()%2==0) System.out.println("Length is even");

        else System.out.println("Length is Odd");
    }
}
