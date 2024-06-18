package Interviewcoding.Interview;

import java.util.Arrays;

public class IntervieC {
    public static void main(String[] args) {
        int [] num1 = {1,2,3};
        int [] num2= {5,6,2};
        int[]result=new int[num1.length+ num2.length];
        for(int i = 0;i< num1.length;i++){
            for(int j=0; j< num2.length;j++){
               result[i]=num1[i];
               result[num1.length+j]=num2[j];

            }
        }
        System.out.println("Combined array: "+ Arrays.toString(result));

    }
}
