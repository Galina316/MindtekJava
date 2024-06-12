package arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // create arr which holds 5 string elements
        // then print it
        // then add elements: "java", "python", "c++", "javascript","c#"
        String [] arr = new String[5];
        System.out.println(Arrays.toString(arr));
         arr[0]= "java";
        arr[1]= "Python";
        arr[2]="c++";
        arr[3]="javascript";
        arr[4]="c#";
        System.out.println(Arrays.toString(arr));
        // make every ell from arr all uppercase
        for(int i= 0; i< arr.length; i++)
        arr [i]=arr[i].toUpperCase();
        System.out.println(Arrays.toString(arr));
        // find a total amount of letter a in whole array
        String arrAsString = Arrays.toString(arr);
        System.out.println((arrAsString.charAt(0)));
        int count=0;
        for(int i =0 ; i<arrAsString.length(); i++){
            if(arrAsString.charAt(i)=='A')count++;
            System.out.println("sum of a is "+ count);
        }

    }
}
