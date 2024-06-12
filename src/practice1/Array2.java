package practice1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,0,0,-3,-4,67,12,-11};
        // create 2 new arrays, regroup elements into pos and neg
        int countPos=0,countNeg = 0;



        for(int i = 0; i< nums.length; i ++){
            int el = nums[i];
            if(el>=0) countPos++;
            if(el<0) countNeg++;

        }int[] posArr = new int[countPos];
        int[] negArr = new int[countNeg];
        int posArrI =0,negArrI = 0;
        for(int i = 0;i< nums.length;i++){
            int el = nums[i];
            if(el>0){
                posArr[posArrI]=el;posArrI++;
            } else if (el<0) {negArr[negArrI]=el;negArrI++;

            }
        }
        System.out.println(Arrays.toString(posArr));
        System.out.println(Arrays.toString(negArr));




    }
}
