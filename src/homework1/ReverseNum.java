package homework1;

public class ReverseNum {
    //Write a method that accepts int as parameter and returns reversed int. Do not use String or StringBuilder
    //
    //Example:
    // .reverseInt(123); -> returns 321
    // .reverseInt(-123); -> returns -321
    // .reverseInt(200); -> returns 2
    public static  int getReversedNum(int num){
        int number = 0;
        if(num<0){
            num = num-num*2;
            while(num>0){
                number = number*10;
                number+=num%10;
                num = num/10;
            }
            return number-number*2;
        }else {
            while (num > 0) {
                number = number * 10;
                number += num % 10;
                num = num / 10;
            }return number;
        }
    }
    public static void main(String[] args) {
        System.out.println(getReversedNum(200));
    }
}
