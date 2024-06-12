package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] nums = {1,5,8,22,55,87,11,45,66};
        System.out.println(Arrays.toString(nums));
        Scanner in = new Scanner(System.in);
        System.out.println("Search for which value?");
        int value = in.nextInt();
        int index = -1;
        for (int i = 0; i< nums.length;i++){
            int el = nums[i];
            if(el==value) index=i;
        }
        System.out.println("Index "+index);

    }
}
