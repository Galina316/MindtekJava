package conditions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // print reveresed of a given string
        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();
        int lastIndex =text.length()-1;
        String res = "";
        while(lastIndex>=0){
            res = res + text.charAt(lastIndex);
            lastIndex --;
        }
        System.out.println(res);
    }
}
