package homework;

import java.util.Arrays;

public class ReverseWordInArray {
    public static void main(String[] args) {
        //1. Create a class with main method
        //2. Create below array
        //String[] words={“Hi”, “java”, “String”};
        //3. Reassign each value of array with reversed word. Then print that array.
        String []word = {"Hi","java","String"};
        String[] reverse = new String[word.length];

        for (int i = 0; i < word.length; i++)
        {
            reverse[i] = "";
            for (int j = word[i].length() - 1; j >= 0; j--)
                reverse[i] += word[i].charAt(j);
            }System.out.println(Arrays.toString(reverse));

        }



}







