package projectday5;

public class TaskBMajorityNum {
    public static void main(String[] args) {
        //Write a code that find most repeated number in
        //array. (Array can have different values)
        //Example:

        int[] nums = {3, 3, 4, 2, 3, 3, 2, 4, 4};
        int repeat = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
                if (sum > repeat) {
                    repeat = sum;
                    num = nums[i];
                }
            }
        }
        System.out.println("Most repeated number is "+num);

    }}