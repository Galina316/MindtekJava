package projectday5;

import java.util.Arrays;

public class MissingNumberTaskA {
    public static void main(String[] args) {
       // Write a code that finds missing number between 1 and 10
       // from given array. (Array can have different values)

        int[] nums = {1,5,3,8,6,9,2,10,4};
        int missnumber=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for(int i =1;i<nums.length;i++){

            if(nums[i-1]+1!=nums[i]){
                System.out.println("Missing number "+(nums[i]-1));


            }
        }
        System.out.println(Arrays.toString(nums));


    }
}
