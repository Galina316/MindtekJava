package leetcode;

import java.util.Arrays;

public class BinSearch {
    public static void main(String[] args) {
        int [ ] nums = new int []{2,3,5,6,77,22,2543,45673};
        Arrays.binarySearch(nums,5);

        System.out.println(search(nums,2543));
    }
    public static int search(int[]nums,int target){
    int left = 0;
    int right = nums.length - 1;

        while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target)return mid;
         else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

        return -1;
}
public static int search1(int []nums,int target ){
        return Arrays.binarySearch(nums,target)<0?-1:Arrays.binarySearch(nums,target);
}

}
