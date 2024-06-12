package redoloops;

public class WhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int num = 20;
        while(num>=10){
            sum=sum+num;
           if(num%2 ==0 ) System.out.println(num);
            num--;
        }
        System.out.println(sum);
    }
}
