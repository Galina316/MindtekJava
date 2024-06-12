package variables;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of triangles side  ");
        int side1=input.nextInt(),side2 = input.nextInt(), side3 = input.nextInt();

        if(side1!=side2 && side1!= side3 && side2!=side3) System.out.println("Isosceles triangle");
        if(side1==side2 && side1 == side3 && side2==side3) System.out.println("equilateral triangle");
        if((side1==side2&& side1 !=side3) ||(side1 ==side3 && side1 !=side2)||(side2==side3 && side2!=side1))
            System.out.println("Isosceles triangle");

    }
}
