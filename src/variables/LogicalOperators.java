package variables;

public class LogicalOperators {
    public static void main(String[] args) {
        // AND -> &&
        // OR -> ||
        boolean isGreen = true;
        boolean noOneIsCrossing = true;
        boolean carisRunning = false;
        boolean canStartDring = isGreen == true && noOneIsCrossing == true && carisRunning;

        if (canStartDring)
            System.out.println("Pres the gas pedal");
        else System.out.println("Wait!");

        // or -> ||
        //buy oranges AND apples -> buy 2 products
        //buy oranges OR apples -. buy 1 product
        System.out.println("Bool club for people with age between 25-35"); // age >=25  age <= 35
        int age = 12;
        boolean validAge = age >= 25 && age <= 35;
        if (validAge)
        System.out.println("You can apply ");
        else System.out.println("Your age is not in range of 25-35");

        System.out.println("Teenager Female Book club"); // age 13<=age<=20 Female age>=13 && age<=19 && gender==1


        }
    }
