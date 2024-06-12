package homework;

import java.util.Arrays;

public class ReturnSumFromArr {
    //Write a method that accepts 2 parameters. First parameter is Array of integers and second parameter is target number.
    // Method should return array of three integers that sum equal to target number. Return null if array has less than 3 numbers.
    //
    //Example:
    //.findTarget([3,1,5,8], 12); returns [3,1,8]
    //.findTarget([2,1], 3); returns null
    //.findTarget([4,2,1,9,6,7], 9); returns [2,1,6]

    public int [] sumTargetFromArr(int[]nums,int target) {
        if (nums.length>3) {
            int sum = 0;
            int[] index = new int[3];
            for (int i = 0; i < nums.length-2; i++) {
                for (int j = i+1; j < nums.length-1; j++) {
                    for (int a = j+1; a < nums.length; a++) {
                        if (nums[i] + nums[j] + nums[a] == target) {
                            sum = nums[i]+nums[j]+nums[a];
                            if(target==sum){
                            }return new int[]{nums[i], nums[j], nums[a]};
                        }

                    }
                }


            }
        }
        return null;
    }


        public static void main (String[]args){
            ReturnSumFromArr method = new ReturnSumFromArr();
            int[] arr = {4,2,1,9,6,7};
            System.out.println(Arrays.toString(method.sumTargetFromArr(arr,9)));
        }

}


