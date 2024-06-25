package Interviewcoding.Interview;

import java.util.Arrays;

public class TwoArrayInOne {
    public static int [] CombinedArray(int arr[],int arr2[]){
        int []result = new int[arr.length+ arr2.length];
        for (int i =0;i< arr.length;i++){
            for(int j= 0;j< arr2.length;j++){
                result[i]=arr[i];
                result[arr.length+j]=arr2[j];
            }

        } return result;
    }

    public static void main(String[] args) {
        int [] num1 = {1,2,3};
        int [] num2= {5,6,2};
        System.out.println(Arrays.toString(CombinedArray(num1,num2)));
    }
}
