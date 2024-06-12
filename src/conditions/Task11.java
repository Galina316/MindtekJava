package conditions;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // print all triplets of given string in separate line

        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();
        int index = 2;
        if(text.length()<3) System.out.println(text);
        while(index<text.length()){
        System.out.println("" +text.charAt(index-2) + text.charAt(index-1)+ text.charAt(index));
        index++;
        }
    }
}
