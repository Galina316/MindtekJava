package arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[]arr = new int[3];
        System.out.println(Arrays.toString(arr));

        // write operation : arr[index]=a;
        arr[0]=56;// can apply char as well 'd';
        System.out.println(Arrays.toString(arr));
        arr[0]=156;
        System.out.println(Arrays.toString(arr));
        // read data: int a = arr[index];
        int el = arr[0];
        System.out.println(el);
        //print/read
        for( int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        // add 2 to every element;
        for( int i = 0; i< arr.length; i++)
        arr[i]+=2;
        System.out.println(Arrays.toString(arr));
    }
}
