package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[] nums = {123,145,167,234,345,567,789,1000};
        System.out.println(Arrays.toString(nums));
        //find and print index of given value
        Scanner in = new Scanner(System.in);
        System.out.println("Search for which value? ");
        int value = in.nextInt();
        int arrIndex = -1;
        for(int i = 0; i< nums.length;i++) {
            int el = nums[i];
            if (value == el) arrIndex = i;break;

        } System.out.println("index " + arrIndex);


    }
}
