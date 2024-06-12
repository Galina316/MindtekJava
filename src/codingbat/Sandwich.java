package codingbat;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        //getSandwich("breadjambread") → "jam"
        //getSandwich("xxbreadjambreadyy") → "jam"
        //getSandwich("xxbreadyy") → ""

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word with jam inside");
        String word = in.next();

        boolean res = word.contains("jam") ;
        int firstIn = word.indexOf("bread");
        int lastIn = word.indexOf("bread");
        //if(res) {
            System.out.println("jam");
            if(firstIn==lastIn){
                System.out.println(word.substring(firstIn,lastIn));
            }else System.out.println("");
        }



    }

