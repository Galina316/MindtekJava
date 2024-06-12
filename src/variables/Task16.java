package variables;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        // to be able to work legally in US: citizen, green card holder, h1b visa holder
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a a citizen? 1-> yes 2->No");
        int q1 = input.nextInt();
        System.out.println("Are you a green card holder? 1-> yes 2->No");
        int q2 = input.nextInt();
        System.out.println("Are you a H1b? 1-> yes 2->No");
        int q3 = input.nextInt();
        boolean pos = (q1==1);
        boolean pos1 = (q2==1);
        boolean pos2= (q3==1);
        if(pos|| pos2|| pos1)
        System.out.println("You are allowed to work in US");
        else System.out.println("You are not allowed to work in US");
        // print if user can vote -> only citizen can vote
        boolean isCitizen = q1==1;
        if(isCitizen) System.out.println("You can vote");
        if(!isCitizen)
        System.out.println("You cant vote!");


    }
}
