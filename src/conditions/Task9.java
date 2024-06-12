package conditions;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // find out if text have identical pairs


        Scanner in = new Scanner(System.in);
        System.out.println("Your word: ");
        String text = in.nextLine();
        int i = 0;
        boolean identicalfound = false;
        while(i < text.length()-1){
            if(text.charAt(i) == text.charAt(i+1)) {
                identicalfound = true;
                System.out.println("found");
                break;
            }
            i++;
        }
        if(identicalfound) System.out.println("Identical pair fount");
        else System.out.println("No identical pairs");
    }
}
