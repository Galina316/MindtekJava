package homework;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        //Write a Java program to separate even and odd numbers from a given array of integers.
        // Put all even numbers first, and then odd numbers.
        // int[] arr = {11,22,23,34,45,56,67,89};

        int[] arr = {11, 22, 23, 34, 45, 56, 67, 89};

        int countEven = 0, countOdd = 0;


        for(int i=0; i< arr.length;i++ ){
            int el = arr[i];
            if(el%2 == 0)countEven++;
            if(el%2!=0) countOdd++;
        }
        int [] evenArr = new int[countEven];
        int [] oddArr = new int[countOdd];
        int evenI = 0,oddI = 0;
        for (int i = 0 ; i< arr.length;i++){
            int el = arr[i];
            if(el%2==0){
                evenArr[evenI] = el;evenI++;
            } else if (el%2!=0) {
                oddArr[oddI] = el; oddI++;
            }
        }
        for(int i =0,even=0,odd=0;i< arr.length;i++){
            if(i<evenArr.length){
                arr[i]=evenArr[even];
                even++;
            }else{
                arr[i]=oddArr[odd];
                odd++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }




    }







