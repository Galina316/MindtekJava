package variables;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String operator = input.next();
        if(operator.equals ("+")) System.out.println("sum: "+(num1+num2));
        if(operator.equals("-")) System.out.println("answer: "+(num1-num2));
        if(operator.equals("*")) System.out.println("Answer: "+(num1*num2));
        // if num2 is not 0 AND the operator is /then do division
        if(operator.equals("/") && num2!=0) System.out.println("Answer : "+(num1/num2));
        if(operator.equals("/")&& num2==0) System.out.println("Undefined");
        // when the given operator not + or - or / or *
        if(!operator.equals("/") && !operator.equals("-")&& !operator.equals("*")&& !operator.equals("+"))
        System.out.println("Invalid Operator...");
    }
}
