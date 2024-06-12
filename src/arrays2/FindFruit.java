package arrays2;

import java.util.Scanner;

public class FindFruit {
    public static void main(String[] args) {
        /*
        Enter fruit:
        watermelon
        apple
        we have apple in store
         */
        String [] store = { "Orange","Banana","Kiwi","Apple","Grapes","Mango"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter what fruit: ");
        String fruit = in.next();
        boolean found = false;
         for(String f: store){
             if(f.equalsIgnoreCase(fruit)){
                 System.out.println("We have this "+ fruit+" in store");
                 found = true;
             }
         }if(!found) System.out.println("we dont have it");
    }
}
