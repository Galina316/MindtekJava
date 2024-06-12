package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSumWithTarget {
    //Write a method that has two parameters with array of
    // ints and target int. If any of the integers are less than
    // or equals to the target number, add those numbers to each other,
    // provided they are unique (If the number duplicate, then add only once).
    // Compare this sum to the target number. If this sum is greater than the target number,
    // return an array with the sum of all the unique numbers
    // that were less than or equal to the target number as well as true.
    // Otherwise return the sum of all the numbers in the original array argument, as well as false.
    //Example:
    //int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3}
    //   .getOutput(nums1, 3); -> returns array of objects [-20, true]
    //
    //int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100}
    //   .getOutput(nums2, 10); -> returns array of objects [132, false]


    public static Object[] getOutput(int[] nums ,int target){
        List <Integer> temp = new ArrayList<>();
        int uniqueOrLess = 0;
        int sum = 0;
        for (int i= 0; i< nums.length;i++){
            sum+= nums[i];
            if(nums[i]<=target && !temp.contains(nums[i])){
                uniqueOrLess+=nums[i];
                temp.add(nums[i]);
            }
        }
        boolean greaterThanTarget = uniqueOrLess<target;
        if(greaterThanTarget){
            return new Object[]{uniqueOrLess,true};
        }else{
            return new Object[]{sum,false};
        }

    }

    public static void main(String[] args) {
        int[] nums1={5, 2, 1, -5, -7, -14, 4, 3, 3};
        System.out.println(Arrays.toString(getOutput(nums1, 3)));
        int[] nums2={7, 8, 5, 1, -4, -4, 11, 6, 12, 1, 1, -12, 100};
        System.out.println(Arrays.toString(getOutput(nums2,10)));

    }
}
