package conditions;

import java.util.Scanner;

public class Task15IncreasingNum {
    // 3 -> go up
    // 7 -> go Down
    //6 -> You WON
    public static void main(String[] args) {
        int secretNum =6;
        System.out.println("You have 3 chances. try to guess my number." +
                "It is in a range of 1 to 10");
        int chance = 3;
        boolean isVictory = false;
        Scanner in = new Scanner(System.in);
        while(chance>=0){
            System.out.println("Your guess?");
            int num = in.nextInt();
            chance--;
            if(num<secretNum) System.out.println("go UP");
            else if(num>secretNum) System.out.println("go down");
            else{
                System.out.println("You Won");
                isVictory = true;
                break;
            }
        }

                if(!isVictory) System.out.println("You lost, my number was : "+secretNum);
    }
}
