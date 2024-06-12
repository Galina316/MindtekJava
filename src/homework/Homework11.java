package homework;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        //Create new array:
        //int[] arr1 = {45,44,32,21,2,1,10};
        //1 print array itself.
        //2 write a code that finds out if elements of the array are in decreasing order. (Decreasing order: When numbers are arranged from high to low.)
        //if there is a decreasing order then print "In decreasing order" otherwise print "Not in order"Ex:
        //[45,44,32,21,2,1,-5]
        //In decreasing order

        int[]arr1= new int[]{45,44,32,21,2,1,1,-5};
        System.out.println(Arrays.toString(arr1));
        boolean decrease = true;
        for(int i=0; i< arr1.length-1; i++){
            if(arr1[i]<arr1[i+1]){
                decrease=false;
                System.out.println("Array is NOT in decreasing order.");
                break;
            }
        }

        if(decrease){
            System.out.println(" Array is in decreasing order");
        }
    }
}








