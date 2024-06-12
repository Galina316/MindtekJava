package practice1;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        String[] animal = {"dog", "cat", "snake" };
            animal[0]="mouse";
            animal[1]= "dog";
        System.out.println(Arrays.toString(animal));

        int []numbers = {1,2,3};
        for(int i = 0; i<numbers.length; i++) {
            boolean six = numbers.length>=1 && (numbers[0]==6|| numbers[numbers.length-1]==6);

        }
    }
}
