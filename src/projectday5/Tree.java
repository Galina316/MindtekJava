package projectday5;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height of tree ");
        int height = in.nextInt();
        String star = "";
        for(int i = 0;i<height;i++){
            star = star + "*";
            System.out.println(""+star);
        }
    }
}
