package leetcode;

import java.util.Arrays;

public class posNegCount {
    public int maximumCount(int[] nums) {
        int pCount = 0;
        int nCount = 0;

        for (int num : nums) {
            if (num > 0) {
                pCount++;
            } else if (num < 0) {
                nCount++;
            }
        }

        return Math.max(pCount, nCount);

    }
    public int maximumCount1(int[] nums) {
        int pCount = 0;
        int nCount = 0;

        for (int n : nums) {
            if (n > 0) {
                pCount++;
            } else if (n < 0) {
                nCount++;
            }
        }

        if (pCount >= nCount) {
            return pCount;
        } else {
            return nCount;
        }
    }

    public static int maximumCount2(int[] nums){
       if(nums[0]>0 || nums[nums.length-1]<0)return nums.length;
       int l=0,r=nums.length-1,mid=0;
       while (l<r){
           mid= l+(r-l)/2;
           if(nums[mid]<0)l=mid+1;
           else r=mid;
       }
       int neg = l;
       l=0;r=nums.length;
       while(l<r){
           mid=l=(r-l)/2;
           if(nums[mid]>0)r=mid;
           else l= mid;
       }
       int pos = nums.length-1;
       return Math.max(neg,pos);

    }

    public static void main(String[] args) {
        maximumCount2(new int []{-7,2,6,0,0,0,0,0});

    }
}
