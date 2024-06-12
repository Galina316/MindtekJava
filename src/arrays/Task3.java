package arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        // count total numbers of even element
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) count++;
        System.out.println("even elements " + count);
        // create a new array which holds all even values take from array and print that new array
        int[] even = new int[count];
        int ei = 0;
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (el % 2 == 0) {
                even[ei] = el;
                ei++;
            }


        }
        System.out.println(Arrays.toString(even));

    }


}