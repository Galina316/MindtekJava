package methods2;

public class MethodOverloading {
    public int getSum(int num1, int num2){
        return num1+num2;
    }
    public int getSum(int[]nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }
    public double getSum(double num1,double num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        MethodOverloading method = new MethodOverloading();
        System.out.println(method.getSum(5,10));
        int[]nums ={5,10,15,20};
        System.out.println(method.getSum(nums));
    }
}
