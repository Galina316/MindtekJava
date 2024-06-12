package arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,0,0,-3,-4,67,12,-11};
        //create 2 new arrays, regroup element into pos and neg
        int countPos=0;
        int countNeg =0;
        //count how many pos and neg i have
        for(int i = 0;i<nums.length; i++) {
            int el = nums[i];
            if (el > 0) countPos++;
        else if (el < 0) countNeg++;
        }
        int[] pos = new int[countPos];
        int[] neg = new int[countNeg];
        //regroup pos and neg
        int posI = 0, negArrI =0;
        for( int i = 0;i< nums.length;i++) {
            int el = nums[i];
            if (el > 0) {
                pos[posI] = el;
                posI++;
            } else if (el < 0) {
                neg[negArrI] = el;
                negArrI++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("arrays of negative "+negArrI);
    }
}
