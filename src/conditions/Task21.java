package conditions;

import java.util.Scanner;

public class Task21 {
    //find if given word contains any dublicate letter
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a word");
        String word = in.next();
        boolean dupFound = false;
        for(int i=0;i<word.length(); i++){
            char letter = word.charAt(i);
            for(int j=i+1; j<word.length();j++){
               // System.out.println("Compare: "+word.charAt(i)+ "-"+word.charAt(j));
                if(word.charAt(i)==word.charAt(j)){
                    dupFound=true;
                    break;
                }
            }
            if(dupFound)break;
        }if(dupFound) System.out.println("Duplicate is found");
        else System.out.println("Duplicate not found");
    }
}
