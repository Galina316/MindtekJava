package Interviewcoding.Interview;

public class ReverseNumber {

public static int reversedNum(int num){
    int result =0;
    while(num!=0){
        int digit = num%10;
        result= result*10+digit;
        num/=10;
    } return result;
}

    public static void main(String[] args) {
        System.out.println(reversedNum(6541));
    }
}
