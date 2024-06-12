package homework;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
//        Create a class with main method
//        2. Create an array of ints: int[] numbers= new int[]{4,3,6,5,9,10, -12, -2, 0};
//        3. Using for loop get count of positive numbers and count of negative numbers. Print total counts.

        int[] numbers = new int []{4,3,6,5,9,10,-12,-2,0};
        int pCount = 0;
        int nCount = 0;
        for(int i= 0;i< numbers.length;i++){
            int el = numbers[i];
            if(el>0){
                pCount++;
            }else if(el<0)
                nCount++;
        }
        //int [] pArr = new int [pCount] ;
        //int [] nArr = new int[nCount] ;
        System.out.println("Positive count is: "+pCount);
        System.out.println("Negative count is : "+nCount);

    }
}
