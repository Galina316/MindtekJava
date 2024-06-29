package leetcode;

import java.util.HashMap;

public class FibNum {
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        int n1=0,n2=1,n3=n1+n2;
        for(int i=2;i<=n;i++){
            n1=n2;
            n2=n3;
        }

        return n3;
    }

    public static int fib1(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib1(n-1)+fib1(n-2);
    }

}
