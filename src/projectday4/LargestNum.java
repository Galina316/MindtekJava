package projectday4;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 different numbers ");
        int[] numbers = new int[5];
        for(int i =0; i<5;i++)
            numbers[i]= in.nextInt();
        int largest =numbers[0];
        for (int i =0; i<numbers.length;i++){
        if(numbers[i]>largest){
            largest = numbers[i];
        }

    }System.out.println("Array "+Arrays.toString((numbers)));
        System.out.println("Largest number is: "+largest);

    }
}
