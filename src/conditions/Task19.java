package conditions;

public class Task19 {
    public static void main(String[] args) {
        //print the sum of 1 to 500 but skip all numbers that end with 00
        //System.out.println(500*501/2);1+2+3+4...num=n*(n+1)/2
        int sum=0;
        for (int i = 1; i <= 500 ;sum+=i++ ){
            sum=sum+i;
            System.out.println(sum);
        }
    }}
