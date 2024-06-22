package Interviewcoding.Interview;

public class MaxNumInArray {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 1, 9};
      int max = nums[0];
      for(int i=1;i< nums.length;i++){
          if(nums[i]>max){
              max=nums[i];
          }
      }
        System.out.println("The Biggest number in Array is "+max);
    }
}
