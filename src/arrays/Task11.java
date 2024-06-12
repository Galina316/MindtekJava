package arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[][] coordinations = {{77,12,23},{56,78,66},{99,89,432}};
        //add 100 to all numbers less than 90
        // substract 100 to all numbers greater than 90

        for(int i = 0; i<coordinations.length;i++){
            for (int j = 0; j < coordinations[i].length;j++){
                //System.out.print(coordinations[i][j]+"-");
                if(coordinations[i][j]<90)coordinations[i][j]+=100;

               else if(coordinations[i][j]>90)coordinations[i][j]-=100;
      }
     }
        for(int[]arr: coordinations) System.out.println(Arrays.toString(arr));


        }
    }
//public int islandPerimeter(int[][] grid) {

    //return 0;
