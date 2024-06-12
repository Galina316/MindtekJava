package conditions;

public class Task3 {
    public static void main(String[] args) {
        // print all numbers from 100 to 50  //if (num%2==0) // num = num-2; only if num is even
        int num=100;
        int sum =0;
        while(num>=50){
            if (num%2==0)
                sum = sum+num;
                System.out.println(num);
            num--;


        }
        System.out.println("end total sum "+ sum);
    }
}
