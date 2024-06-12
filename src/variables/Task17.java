package variables;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println("Chicago Marathon application app");
        // to be able to apply:
        //person must live in Chicagoland area
        //age must be 22<=age>=65
        // gender can be male or female
        //ask a use if they live in Chicakoland area: 1 for yes 2 for no
        //ask a use they age, is valid
        // ask for use their gender: 1 yes 2 no
        // from all given info print if this person can apply or no

        Scanner input = new Scanner(System.in);
        System.out.println("Are you live in Chicagoland area? 1->Yes 2->No");
        int q1 = input.nextInt();
        System.out.println(" What is you age?");
        int age = input.nextInt();
        System.out.println("Your gender: 1->Male  2->Female");
        int q3 = input.nextInt();
        boolean isInChicago = q1 ==1;
        boolean isValidage = age >= 22 && age <=65;
        boolean isValidgender = q3 == 1 || q3 == 2;
        if (isInChicago && isValidage && isValidgender) System.out.println("You can apply");
        else System.out.println("Sorry, you do not meet all criteria...");
    }
}
