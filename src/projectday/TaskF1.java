package projectday;

import java.util.Scanner;

public class TaskF1 {
    //Write a Java program to determine the discount percentage a customer gets based on their
    //total purchase amount. If the total purchase amount is greater than or equal to 100, the
    //discount percentage is 10%. If the total purchase amount is between 50 and 99.99, the
    //discount percentage is 5%. Otherwise, if the total purchase amount is less than 50, there
    //no discount.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total purchase amount:");
        double total = in.nextDouble();
        int discountPer;
        if(total>=100){
            discountPer = 10;
            System.out.println("Discount percentage: "+discountPer+"%");
            double disccountedPrice = total - (total*0.1);
            System.out.println("Discount Price is: "+disccountedPrice);}
            else if(total>=50){
                discountPer = 5;
                System.out.println("Discount percentage: "+discountPer+"%");
                double disccountedPrice1 = total - (total*0.05);
                System.out.println("Discount Price is: "+ disccountedPrice1);}
                else if(total<50 && total>=0){
                    discountPer = 0;
                    System.out.println("Discount percentage: "+discountPer+"%");
                    double disccountedPrice2 = total - (total*0);
                    System.out.println("Discount Price is: "+ disccountedPrice2);}
                else System.out.println("Invalid entry");
            }
        }



