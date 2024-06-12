package projectday4;

public class SummOfOddNums {
    public static void main(String[] args) {
        int [] nums = {4,2,9,1,0,21,101};
        int sum = 0;
        for(int i = 0; i<nums.length;i++)
        if(nums[i]%2!=0){
            sum+=nums[i];

        } System.out.println("Total odd sum is: "+sum);
    }
}
