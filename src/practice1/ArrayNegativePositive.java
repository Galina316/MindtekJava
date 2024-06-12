package practice1;

import java.util.Arrays;

public class ArrayNegativePositive {
    public static void main(String[] args) {
        int[]nums = {1,2,3,5,0,0,-3,-4,67,12,-11};

        int countPos = 0;
        int countNeg = 0;
        for(int i = 0; i<nums.length; i++){
            int el = nums[i];
            if(el>0)countPos++;
            else if (el<0)countNeg++;
        }
        int [] posArr = new int [countPos];
        int [] negArr = new int [countNeg];
        int possArrI =0, negArrI = 0;
        for (int i = 0; i< nums.length;i++){
            int el = nums[i];
            if(el>0){
                posArr[possArrI]=el;
                possArrI++;
            }else if(el<0){
                negArr[negArrI]=el;
                negArrI++;
            }
        }

        System.out.println(Arrays.toString(posArr));
        System.out.println(Arrays.toString(negArr));
    }
}
