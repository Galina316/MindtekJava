package projectday5;

import java.util.Arrays;

public class TaskCDup {
    public static void main(String[] args) {
        //Write a code that finds duplicates in Array.
        //(Array can have different values)
        //Example:

        int[] nums={4,3,2,7,8,2,3,1};
        //output: 2, 3
        int repeat = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    repeat++;
                }
            }
        }
        System.out.println(repeat);
        int[] dup = new int[repeat];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    dup[k]=nums[i];
                    k++;
                }
            }
        }
        System.out.println(dup);
        System.out.println(Arrays.toString(dup));
    }
}