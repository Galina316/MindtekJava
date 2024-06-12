package conditions;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //keep asking a user to enter a word until they enter exit
        // for each given word construct a new word by putting *
        // after every letter and print it
        Scanner in = new Scanner(System.in);
        //String word = in.next();
        String stop = " Exit";
        while (true) {
            System.out.println("Enter a word");
            String word = in.next();
            if(word.equals("exit"))break;
            //task16
            String res ="";
            int i =0;
            while(i<word.length()){
                res=res +word.charAt(i)+"*";
            i++;
            }
            System.out.println(res);

        }System.out.println("The end");
    }
}
