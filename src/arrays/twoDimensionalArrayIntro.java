package arrays;

import java.util.Arrays;

public class twoDimensionalArrayIntro {
    public static void main(String[] args) {
        //int[][] coordinations = new int[3][3];//int[][] coordinations = {{},{},{}}
        int[][] coordinations = {{77,12,23},{56,78,66},{99,89,432}};


        //coordinations[1][0]=coordinations[1][0]=1;
        System.out.println(Arrays.toString(coordinations));
        for(int[]arr: coordinations) System.out.println(Arrays.toString(arr));
        System.out.println("--------");
        System.out.println(coordinations[0][0]);
        for(int i = 0; i<coordinations.length;i++){
            for (int j = 0; i < coordinations[i].length;j++){
                //System.out.print(coordinations[i][j]+"-");
                if(coordinations[i][j]%2==1)coordinations[i][j]++;
            }
        }
    }
}
