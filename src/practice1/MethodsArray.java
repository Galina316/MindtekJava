package practice1;

import java.util.Arrays;

public class MethodsArray {
    public static void main(String[] args) {
        String text = "I am learning java";
        String [] word = text.split(" ");
        System.out.println(Arrays.toString(word));
        for(String el : word) System.out.println(el);
        char[] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars));
        int[]nums = {6,8,1,2,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
