package practice1;

import java.util.Scanner;

public class AndOrPractice {
    public static void main(String[] args) {
        //you can apply for job in US
        // must be citize or green card holder or have vise h1b
        String text = "Are you a US citizen?";
        System.out.println(text.toUpperCase()+"? 1 -> yes 2-> no");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        boolean num = answer==1;
        System.out.println("Are you a green card holder? 1 -> yes 2-> no");
        int answer1 = input.nextInt();
        boolean num1 = answer1==1;
        System.out.println("Do you have a visa h1b? 1 -> yes 2-> no");
        int answer2 = input.nextInt();
        boolean num2 = answer2==1;
        if(num||num1||num2) System.out.println("You can work in US");
        else System.out.println("You cant work in US");
        if(num) System.out.println("You can vote in US");
        else System.out.println("You cant vote in US");







    }
}
