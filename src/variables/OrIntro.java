package variables;

import java.util.Scanner;

public class OrIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you like dogs? 1-> Yes 2-> NO");
        int likesDogs = input.nextInt();
        System.out.println("Do you like Cats? 1-> Yes 2-> NO");
        int likesCats = input.nextInt();

        System.out.println("Do you like pets? 1-> Yes 2-> NO");
        int likePets = input.nextInt();
        // find out if this person like pets

        if((likesDogs ==1 || likesCats==1) && likePets==1) System.out.println("You can be a pet owner");
        else System.out.println("Seems like you will not own cats and dogs ");
    }
}
