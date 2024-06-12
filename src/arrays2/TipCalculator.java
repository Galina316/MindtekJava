package arrays2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        /*
        enter your balance : 100$
        how would you rate our service?(great/good/fair/custom)
        great
        %25 tip is added
        your total: 125
        good is 20%      fair 10%     custom enter your tip amount:
        Do you want to split the check?
        if yes How many people ..... 5
        you are splitting the check for &&&&& people Each pays: 30$
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your balance");
        int balance = in.nextInt();
        boolean invalidEntry = false;
        int tip = 0;
        do {
            System.out.println("How would you rate our service? (great/good/fair/custom)");
            String service = in.next();//.toLowerCase//();
            //if(service.equalsIgnoreCase("great")){}

            switch (service.toLowerCase()) {
                case "great":
                    tip = 25;
                    break;
                case "good":
                    tip = 20;
                    break;
                case "fair":
                    tip = 10;
                    break;
                case "custom":
                    System.out.println("Enter tip amount:");
                    int tipamount = in.nextInt();
                    balance += tipamount;
                    break;
                default:
                    System.out.println("invalid Entry");
                    invalidEntry= true;
            }
        }while(invalidEntry);
        balance+=balance*tip/100;
        System.out.println("your total is : "+balance);
        do {
            System.out.println("Do you want split a check?(yes/no)");
            String split = in.next();
            invalidEntry = false;
            if (split.equalsIgnoreCase("No")) {
                System.out.println("Your total is : " + balance);
            } else if (split.equalsIgnoreCase("Yes")) {
                System.out.println("how many people");
                int people = in.nextInt();
                int eachPays = balance / people;
                String icon = "";
                while (people > 0) {
                    icon += "&";
                    people--;

                }
                System.out.println("you are splitting the check " + icon + " people");
                System.out.println("Each pays: " + eachPays);

            }else{
                System.out.println("Invalid Entry");
                invalidEntry=true;
            }

        } while (invalidEntry);

    }
}
