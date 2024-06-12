package variables;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Adult or not Adult");
        //ask a user their age
        //if their age >=18 print adult, otherwise print "not adult"
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age>=18){
            System.out.println("You are adult");
        }else System.out.println("Not adult");
    }
}
