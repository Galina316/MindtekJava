package conditions;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // print if given numbers were is increased order or not
        Scanner in = new Scanner(System.in);
        int prevNum = -3;
        boolean isInc =true;
        boolean incHappened = false;

        while(true){
            System.out.println("Type a number: ");
            int num = in.nextInt();
            if(prevNum<0)prevNum = num;
            if(num<0)break;
            if(prevNum<=num) {
                if(prevNum<=num) incHappened=true;
            prevNum = num;
        }
            else isInc=false;
    }
        if(isInc&&incHappened) System.out.println("Increamanting order");
        else System.out.println("not  number is increasing");
        System.out.println("The end");

    }}

